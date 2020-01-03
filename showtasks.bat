call runcrud
if "%ERRORLEVEL%" == "0" goto start
echo.
echo There are errors with running runcrud.bat

:start
cd "C:\Program Files (x86)\Google\Chrome\Application\"
start chrome.exe http://localhost:8080/crud/v1/task/getTasks
