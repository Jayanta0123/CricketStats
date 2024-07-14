# CricketStats
A small java-application to manifest the beauty of multithreaded programs. It simply reads different cricketers' profile from CricBuzz.com, and display some stats. Code entirely written in core-java.

# How to Use it
1. Download apache-commons library first from this maven-repository, page link https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.8.1
2. Add this jar file in your build-path in eclipse/IntelliJ. We are going to use one API from the StringUtils class.
3. Run the **SingleThreadedStats** class as a java-app, currently it processes 150 cricketers' profiles.
4. Run the **MultiThreadedStats** class next as a java-app, it processes 10000 cricketers' profiles.
5. See the difference in execution-time, you will understand why multi-threading is preferred in this kind of scenario.
6. Play with the app, and see where it breaks.
7. A small update, the project has been converted to a maven-project and the apache-common library is added as a maven dependency. So you don't need to set the classpath. You can import the project as a maven-project, build the project, and start using it.

# How to use only the Maven-executable
1. Install latest java from OpenJdk (https://www.openlogic.com/openjdk-downloads), download Maven archive(https://maven.apache.org/), unzip to a folder; set both of them in your classpath (Give names as JAVA_HOME and MAVEN_HOME respectively)
2. Clone the CricketStats project, go to its base-directory. If downloaded, unzip the file and go to its base.
3. Open CMD, check java and maven versions by running these commands - _*$java -version*_ and _*$mvn -version*_  
4. If it shows the same versions which you have set, all good with the setup. Please ensure java version in your system is atleast Java-8. If not, kindly upgrade java before moving ahead.
5. In your command prompt, pls do a maven install, command -_**$mvn clean install**_. Allow the process to finish.
5. Copy the big jar from target folder containing dependencies (fileName: CricketStats-1.0.0-jar-with-dependencies.jar) into a suitable location.
5. Go to that folder and execute the following command  _**$java -jar CricketStats-1.0.0-jar-with-dependencies.jar**_
6. If you encouter some memory issues, use the Xms and Xmx java-heap options, like this one works for me
_**$java -jar -Xms768m -Xmx1G CricketStats-1.0.0-jar-with-dependencies.jar**_

# Changes in the project
1. As of May-2019, the stats-data have been moved from *printing in the console* to **write to external files** because of buffer-constraint. Now run the Multi-threaded program to see the stats-data become available in different ***cricbuzz_<game-type>_stats*** text files in the root folder. 

# Comments and Suggestions
Your valuable comments are most welcome, write me back at *jmandal2k6 AT hotmail.com*
