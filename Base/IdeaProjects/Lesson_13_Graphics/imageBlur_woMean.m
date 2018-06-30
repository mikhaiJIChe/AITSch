tic
dirName = 'C:\Users\mikhail\Dropbox\IdeaProjects\Lesson_13\';
image = uint16(imread([dirName 'image.jpg']));
temp = image; 
windowSize = 5;
COLORS_IN_RGB = 3;
dw = fix(windowSize / 2); %% fix - выделение целой части;
for i = 1 + dw : size(image,1) - dw
    for j = 1 + dw : size(image,2) - dw
        temp(i,j,:) = 0;
        for k = i - dw : i + dw
            for m = j - dw : j + dw
                for n = 1 : COLORS_IN_RGB
                    temp(i,j,n) = temp(i,j,n) + image(k, m, n);
                end
            end
        end
        temp(i,j,:) = temp(i,j,:) / (windowSize * windowSize);
    end
end
temp = uint8(temp);
imwrite(temp,[dirName 'image_Blur_MatLab_WithoutMean_WindowSize_' num2str(windowSize) '.jpg']);
toc