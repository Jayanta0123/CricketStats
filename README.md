# CricketStats
A small java-application to manifest the beauty of multi-threaded programs. It simply reads different cricketers' profile from CricBuzz.com, and display some stats. Code entirely written in core-java.

# How to Use it
1. Download apache-commons library first from this maven-repository, page link https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.8.1
2. Add this jar file in your build-path in eclipse/IntelliJ. We are going to use one API from the StringUtils class.
3. Run the **SingleThreadedStats** class as a java-app, currently it processes 150 cricketers' profiles.
4. Run the **MultiThreadedStats** class next as a java-app, it processes 10000 cricketers' profiles.
5. See the difference in execution-time, you will understand why multi-threading is preferred in this kind of scenario.
6. Play with the app, and see where it breaks.
7. A small update, the project has been converted to a maven-project and the apache-common library is added as a maven dependency. So you don't need to set the classpath. You can import the project as a maven-project, build the project, and start using it.

# Changes in the project
1. As of May-2019, the stats-data have been moved from *printing in the console* to **write to external files** because of buffer-constraint. Now run the Multi-threaded program to see the stats-data become available in different ***cricbuzz_<game-type>_stats*** text files in the root folder. 

# Comments and Suggestions
Your valuable comments are most welcome, write me back at *jmandal82 AT hotmail.com*

