set encoding=-encoding UTF-8 -charset UTF-8 -docencoding UTF-8
set tags=-tag t.url:a:"Url:" -tag t.returnFields:a:"Return Fields:" -tag t.returnExample:a:"Return Example:"
rem "c:\Program Files\Java\jdk1.7.0_25\bin\javadoc.exe"  %encoding% %tags% TestJavaDoc.java


"c:\Program Files\Java\jdk1.7.0_25\bin\javadoc.exe"  -doclet ListClass -docletpath . TestJavaDocPlain.java

