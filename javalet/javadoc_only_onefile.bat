@echo off

set srcbase=d:\mine\programming\java\javalet
set encoding=-encoding UTF-8 -charset UTF-8 -docencoding UTF-8
set tags=-tag t.url:a:"Url:" -tag t.returnFields:a:"Return Fields:" -tag t.returnExample:a:"Return Example:"
set doclet=-doclet ListClass -docletpath .\build\classes\main
set spath=-sourcepath %srcbase%\src\main\resources

rem "c:\Program Files\Java\jdk1.7.0_25\bin\javadoc.exe"  %encoding% %tags% TestJavaDoc.java

@"c:\Program Files\Java\jdk1.7.0_25\bin\javadoc.exe"  %doclet% %spath% %srcbase%\src\main\resources\com\Test.java

