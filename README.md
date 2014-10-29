# Description

Trivial example of setting up a Scala/Java-project with maven instead of sbt.

    mvn clean compile assembly:single
    java -jar target/scala-1.0-SNAPSHOT-jar-with-dependencies.jar


# Classpath and java magic

Use

    mvn dependency:build-classpath -Dmdep.outputFile=classpath.log
    java -cp target/classes:$(cat classpath.log) com.mlesniak.App