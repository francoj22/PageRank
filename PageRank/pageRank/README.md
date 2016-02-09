*******************************************Description*************************************************************
* @author :Franco Gutierrez
* version :1.0
* @Description This project is a represation of the algorithm page Rank it try to give a vote to each page according to the baclinks and outlinks. 
* The formula implemented is P(R)= 1-damping factor + damping * (sum+=P(T)/C(T))
* Where P(T) means one backlink divided by the outlinks contains in T.
* It makes use of
* PathName         : Argument that specified the location of the path.
*
* @since :2016-01-01
*
* Part 3. Information Retreiveal
* Taking
* literature.offline/authors/carroll-lewis/index.html
* as the start page with a score of 100
* calculate the Pagerank of each page with a dampening factor of 0.8 and 5 rounds of calculations.
* Show the pageranks of the top 10 pages after each round.
* remember to remove "stub" files after round 1.
*
*
** Getting started**
* Step 0: Running the program
* step 1: Download the jdk from the oracle web page .
*      http://www.oracle.com/technetwork/java/javase/downloads/index.html
* Step 2: Put it in your evironment Variables System creating an JAVA_HOME path
* Step 3: Put the jre path to run executable jars
* Step 4: Get the location of the Jar file
* Step 5: run it by the command "java -jar IRModel.jar"
* Step 6: 


**********************************************Example************************************************************

"C:\Program Files\Java\jdk1.8.0_60\bin\java" -Didea.launcher.port=7534 "-Didea.launcher.bin.path=C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 14.1.5\bin" -Dfile.encoding=windows-1252 -classpath "C:\Program Files\Java\jdk1.8.0_60\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\zipfs.jar;C:\Users\Franco\IdeaProjects\pageRank\out\production\pageRank;C:\Users\Franco\IdeaProjects\pageRank\jsoup-1.8.3.jar;C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 14.1.5\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain ie.Franco.main.Main
Found (11) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-02.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (10) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-01.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-03.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-02.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-04.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-03.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-05.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-04.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-06.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-05.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-07.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-06.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-08.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-07.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-09.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-08.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-10.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-09.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-11.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-10.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-12.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-12.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-11.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
Found (0) links
*****************
*****************
Found (0) links
*****************
*****************
Found (24) links
*****************
index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
../the-hunting-of-the-snark/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
../through-the-looking-glass/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
../sylvie-and-bruno/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-01.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-02.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-03.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-04.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-05.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-06.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-07.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-08.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-09.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-10.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-11.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-12.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-12.html
Found (24) links
*****************
index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
../the-hunting-of-the-snark/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
../through-the-looking-glass/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
../sylvie-and-bruno/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-01.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-02.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-03.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-04.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-05.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-06.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-07.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-08.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-09.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-10.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-11.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-12.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/chapter-12.html
Found (7) links
*****************
alices-adventures-in-wonderland/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
the-hunting-of-the-snark/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
through-the-looking-glass/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
sylvie-and-bruno/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
Found (8) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-02.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-01.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-03.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-02.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-04.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-03.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-05.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-04.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-06.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-05.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-07.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-06.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-08.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-07.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-09.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-08.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-10.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-09.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-11.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-10.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-12.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-12.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-11.html
chapter-13.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-13.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-13.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-12.html
chapter-14.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-14.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-12.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-14.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-13.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-13.html
chapter-15.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-15.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-13.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-15.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-14.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-14.html
chapter-16.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-16.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-14.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-16.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-15.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-15.html
chapter-17.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-17.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-15.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-17.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-16.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-16.html
chapter-18.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-18.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-16.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-18.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-17.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-17.html
chapter-19.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-19.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-17.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-19.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-18.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-18.html
chapter-20.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-20.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-18.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-20.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-19.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-19.html
chapter-21.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-21.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-19.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-21.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-20.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-20.html
chapter-22.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-22.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-20.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-22.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-21.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-21.html
chapter-23.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-23.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-21.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-23.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-22.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-22.html
chapter-24.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-24.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-22.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-24.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-23.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-23.html
chapter-25.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-25.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-23.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-25.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (8) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-24.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-24.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-24.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (37) links
*****************
../alices-adventures-in-wonderland/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
../the-hunting-of-the-snark/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
../through-the-looking-glass/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
preface.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/preface.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-01.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-02.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-03.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-04.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-05.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-06.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-07.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-08.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-09.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-10.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-11.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-12.html
chapter-13.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-13.html
chapter-14.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-14.html
chapter-15.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-15.html
chapter-16.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-16.html
chapter-17.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-17.html
chapter-18.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-18.html
chapter-19.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-19.html
chapter-20.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-20.html
chapter-21.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-21.html
chapter-22.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-22.html
chapter-23.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-23.html
chapter-24.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-24.html
chapter-25.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-25.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/preface.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-12.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-13.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-14.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-15.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-16.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-17.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-18.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-19.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-20.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-21.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-22.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-23.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-24.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-25.html
Found (37) links
*****************
../alices-adventures-in-wonderland/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
../the-hunting-of-the-snark/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
../through-the-looking-glass/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
preface.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/preface.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-01.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-02.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-03.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-04.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-05.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-06.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-07.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-08.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-09.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-10.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-11.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-12.html
chapter-13.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-13.html
chapter-14.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-14.html
chapter-15.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-15.html
chapter-16.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-16.html
chapter-17.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-17.html
chapter-18.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-18.html
chapter-19.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-19.html
chapter-20.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-20.html
chapter-21.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-21.html
chapter-22.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-22.html
chapter-23.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-23.html
chapter-24.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-24.html
chapter-25.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-25.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/preface.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-12.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-13.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-14.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-15.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-16.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-17.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-18.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-19.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-20.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-21.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-22.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-23.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-24.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-25.html
Found (8) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-01.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (0) links
*****************
*****************
Found (8) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-02.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (10) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-01.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-03.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-02.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-04.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-03.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-05.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-04.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-06.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-05.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-07.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-06.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-08.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-07.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
Found (20) links
*****************
../alices-adventures-in-wonderland/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
../through-the-looking-glass/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
../sylvie-and-bruno/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
preface.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/preface.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-01.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-02.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-03.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-04.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-05.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-06.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-07.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-08.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/preface.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-08.html
Found (20) links
*****************
../alices-adventures-in-wonderland/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
../through-the-looking-glass/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
../sylvie-and-bruno/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
preface.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/preface.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-01.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-02.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-03.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-04.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-05.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-06.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-07.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-08.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/preface.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-08.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-01.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (8) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-02.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-01.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-03.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-02.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-04.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-03.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-05.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-04.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-06.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-05.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-07.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-06.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-08.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-07.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-09.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-08.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-10.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-09.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-11.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-10.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-12.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-12.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
Found (9) links
*****************
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-11.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
Found (23) links
*****************
../alices-adventures-in-wonderland/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
../the-hunting-of-the-snark/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
../sylvie-and-bruno/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-01.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-02.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-03.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-04.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-05.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-06.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-07.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-08.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-09.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-10.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-11.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-12.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-12.html
Found (23) links
*****************
../alices-adventures-in-wonderland/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
../the-hunting-of-the-snark/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
../sylvie-and-bruno/index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
index-2.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
../index.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/index.html
chapter-01.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-01.html
chapter-02.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-02.html
chapter-03.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-03.html
chapter-04.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-04.html
chapter-05.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-05.html
chapter-06.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-06.html
chapter-07.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-07.html
chapter-08.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-08.html
chapter-09.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-09.html
chapter-10.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-10.html
chapter-11.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-11.html
chapter-12.html 2 C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-12.html
*****************
C:/Users/Franco/IdeaProjects/pageRank/html/alices-adventures-in-wonderland/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/the-hunting-of-the-snark/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/sylvie-and-bruno/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/index-2.html
C:/Users/Franco/IdeaProjects/pageRank/html/index.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-01.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-02.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-03.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-04.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-05.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-06.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-07.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-08.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-09.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-10.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-11.html
C:/Users/Franco/IdeaProjects/pageRank/html/through-the-looking-glass/chapter-12.html
Loading PageRank Information : 
Nro		Page-Rank	in-links	out-links		URL
16		0.342			67			4			index.html
42		0.321			54			32			sylvie-and-bruno/index-2.html
14		0.259			27			18			alices-adventures-in-wonderland/index-2.html
69		0.259			27			18			through-the-looking-glass/index-2.html
54		0.247			21			15			the-hunting-of-the-snark/index-2.html
43		0.208			9			32			sylvie-and-bruno/index.html
15		0.208			9			18			alices-adventures-in-wonderland/index.html
70		0.208			9			18			through-the-looking-glass/index.html
55		0.208			9			15			the-hunting-of-the-snark/index.html
46		0.207			4			4			the-hunting-of-the-snark/chapter-01.html
Loading PageRank Information : 
Nro		Page-Rank	in-links	out-links		URL
16		2.273			67			4			index.html
42		1.968			54			32			sylvie-and-bruno/index-2.html
14		1.058			27			18			alices-adventures-in-wonderland/index-2.html
69		1.058			27			18			through-the-looking-glass/index-2.html
54		0.881			21			15			the-hunting-of-the-snark/index-2.html
43		0.347			9			32			sylvie-and-bruno/index.html
15		0.347			9			18			alices-adventures-in-wonderland/index.html
70		0.347			9			18			through-the-looking-glass/index.html
55		0.347			9			15			the-hunting-of-the-snark/index.html
47		0.298			4			5			the-hunting-of-the-snark/chapter-02.html
Loading PageRank Information : 
Nro		Page-Rank	in-links	out-links		URL
16		3.154			67			4			index.html
42		2.614			54			32			sylvie-and-bruno/index-2.html
14		1.405			27			18			alices-adventures-in-wonderland/index-2.html
69		1.405			27			18			through-the-looking-glass/index-2.html
54		1.157			21			15			the-hunting-of-the-snark/index-2.html
43		0.903			9			32			sylvie-and-bruno/index.html
15		0.903			9			18			alices-adventures-in-wonderland/index.html
70		0.903			9			18			through-the-looking-glass/index.html
55		0.903			9			15			the-hunting-of-the-snark/index.html
47		0.371			4			5			the-hunting-of-the-snark/chapter-02.html
Loading PageRank Information : 
Nro		Page-Rank	in-links	out-links		URL
16		3.941			67			4			index.html
42		3.212			54			32			sylvie-and-bruno/index-2.html
14		1.708			27			18			alices-adventures-in-wonderland/index-2.html
69		1.708			27			18			through-the-looking-glass/index-2.html
54		1.400			21			15			the-hunting-of-the-snark/index-2.html
43		1.234			9			32			sylvie-and-bruno/index.html
15		1.234			9			18			alices-adventures-in-wonderland/index.html
70		1.234			9			18			through-the-looking-glass/index.html
55		1.234			9			15			the-hunting-of-the-snark/index.html
47		0.439			4			5			the-hunting-of-the-snark/chapter-02.html
Loading PageRank Information : 
Nro		Page-Rank	in-links	out-links		URL
16		4.594			67			4			index.html
42		3.667			54			32			sylvie-and-bruno/index-2.html
14		1.977			27			18			alices-adventures-in-wonderland/index-2.html
69		1.977			27			18			through-the-looking-glass/index-2.html
54		1.627			21			15			the-hunting-of-the-snark/index-2.html
43		1.501			9			32			sylvie-and-bruno/index.html
15		1.501			9			18			alices-adventures-in-wonderland/index.html
70		1.501			9			18			through-the-looking-glass/index.html
55		1.501			9			15			the-hunting-of-the-snark/index.html
47		0.493			4			5			the-hunting-of-the-snark/chapter-02.html


Process finished with exit code 0
