@echo off
chcp 1251 > nul
java -Dfile.encoding=windows-1251 -Dsun.jnu.encoding=windows-1251 -Dconsole.encoding=windows-1251 -jar %1
