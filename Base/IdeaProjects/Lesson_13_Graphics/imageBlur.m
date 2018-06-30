dirName = 'C:\Users\mikhail\Dropbox\IdeaProjects\Lesson_13\';
image = imread([dirName 'image.jpg']);
temp = image; 
windowSize = 11;
dw = fix(windowSize / 2); %% fix - выделение целой части;
for i = 1 + dw : size(image,1) - dw
    for j = 1 + dw : size(image,2) - dw
        temp(i,j,:) = mean(mean(image(i - dw : i + dw , j - dw : j + dw, :))); 
        % mean выдает матрицу A средних значений матрицы temp: A = mean(temp).
        % размерность mean(temp) меньше размерности temp на единицу.
        % размерность temp = 3, mean(mean(temp)) выдает массив размерности 1: колонку из трех элементов.
    end
end
imwrite(temp,[dirName 'image_Blur_MatLab_WindowSize_' num2str(windowSize) '.jpg']);