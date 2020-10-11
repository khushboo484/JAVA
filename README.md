# JAVA
small projects using core java


Steps to install maven in your pc -

Here I'm taking an example to install it on windows 10

Installing Maven 3.6.1 on Windows  10 64 bit :

1. Open browser in your pc and enter the following link
 https://maven.apache.org/download.cgi

2. open the link
Download the zip file under the link option

3. After downloading the zip file 
extract the file where to want to unzip it

4. Now setup Environment changes for maven
Right click on my pc and click on properties option

5. Advanced system settings -> Environment Variables -> Click on new button 
Enter variable Name as Maven_Home
Enter variable value  maven folder path   as F:\maven

6. Now under system variables select Path variable  and click on edit button
click on New and enter value as %Maven_Home%\bin

7. At last, go to Start enter cmd then open
Enter mvn
Your Maven is ready in your pc ..

***********************************************************************

Create your first project of Maven using command prompt

1. open a directory where you want to create a maven project
2. now open command prompt at this directory ( it can be done by writing cmd where path of directory is displayed and click enter )
3. Cmd will open, you can check your maven version by writing a command 
> mvn -version

4. Run below command in your command prompt
mvn archetype:generate -DgroupId=com.khushboo -DartifactId=functional_test
 -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

here DgroupId is your name  and give DartifactId as your wish
and then hit enter

If it shows Build Success , it means your maven project is created successfully !!


