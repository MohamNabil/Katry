@echo off
set path=C:\Users\mohamed.elkatry\.m2\repository\allure\allure-2.17.2\bin;C:\Program Files\Java\jdk-17.0.1\bin;%path%
allure serve allure-results
pause
exit