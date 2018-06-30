dirName = 'C:\Users\mikhail\Dropbox\IdeaProjects\Lesson_13\';
image = imread([dirName 'image.jpg']);
temp = image; 
windowSize = 11;
dw = fix(windowSize / 2); %% fix - ��������� ����� �����;
for i = 1 + dw : size(image,1) - dw
    for j = 1 + dw : size(image,2) - dw
        temp(i,j,:) = mean(mean(image(i - dw : i + dw , j - dw : j + dw, :))); 
        % mean ������ ������� A ������� �������� ������� temp: A = mean(temp).
        % ����������� mean(temp) ������ ����������� temp �� �������.
        % ����������� temp = 3, mean(mean(temp)) ������ ������ ����������� 1: ������� �� ���� ���������.
    end
end
imwrite(temp,[dirName 'image_Blur_MatLab_WindowSize_' num2str(windowSize) '.jpg']);