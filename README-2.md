
Запуск и выполнение программы
=============================

Программа - это набор инструкций для процессора.
Каждая инструкция выполняется процессором за 1-проход.

Храниться программа на (дисковом) носителе информации как файл.
При запуске, инструкции из этого файла загружаются в рабочую область памяти (ОЗУ) - это есть процесс (те инструкции которые размещаются в ОЗУ).
Чтобы выполнять эти инструкции, нужно выделить время процессору для выполнения этой программы - это есть поток.

В программе присутствует основной-зарезервированый метод 'main()', который создает 'основной поток'.
Каждый поток характеризуется таким параметром как 'приоритет' - это частота обращений процессора к потоку.



* `/usr/lib/jvm/jdk1.7.0_25/bin/javap -c LinearAlgorithm.class`
* `-c $OutputPath$\$FileDirRelativeToSourcepath$\$FileNameWithoutExtension$.class`
* `Bytecode`: [What’s Cool In IntelliJIDEA. Part III: External Tools](http://arhipov.blogspot.com/2011/08/whats-cool-in-intellijidea-part-iii.html)
* [http://www.javalobby.org/java/forums/t103827.html](http://www.javalobby.org/java/forums/t103827.html)
* [http://cafebabe.sourceforge.net/](http://cafebabe.sourceforge.net/)

![Settings >> External Tools and press Add](http://4.bp.blogspot.com/-g2_YSFMMIMs/TlvT75Jv_BI/AAAAAAAAOBU/bnZY7A9vyAQ/s1600/external-tools.png)

![$FileClass$ and $OutputPath$](http://3.bp.blogspot.com/-CIFIrTcuB_o/TlvUo3j6o8I/AAAAAAAAOBc/SzICrEiwnkI/s1600/external-tools-2.png)

![javap](http://3.bp.blogspot.com/-Oe-I6DcnlzE/TlvV1llPw4I/AAAAAAAAOBk/du4A-PbUvj4/s1600/external-tools-3.png)

![Browse to Settings >> Keymap](http://3.bp.blogspot.com/-mvBXlf4syhM/TlvXtuybjoI/AAAAAAAAOBs/4SgDYVJorDc/s1600/keymap.png)

![example](http://1.bp.blogspot.com/-_cI-MhefOAM/TlvYvXnKnrI/AAAAAAAAOB0/W_d1QW1t0pY/s1600/javap.png)


* `Java Decompiler`: [JD-IntelliJ](http://jd.benow.ca/)
* [http://plugins.jetbrains.com/plugin/7100](http://plugins.jetbrains.com/plugin/7100)


* ![Brice Dutheil](http://jd.benow.ca/img/screenshot16.png)