name := """drools-upperlimb"""
organization := "com.sof"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).settings(
  watchSources ++= (baseDirectory.value / "ui/src" ** "*").get
)

scalaVersion := "2.13.3"

libraryDependencies += guice
/*libraryDependencies ++= Seq(
  javaJdbc
)

name := """play-java-cassandra-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"*/

libraryDependencies += guice

// Cassandra Database
libraryDependencies += "com.datastax.oss" % "java-driver-core" % "4.9.0"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.12.2"
libraryDependencies ++= Seq(
  javaWs
)
//Drools dependencies
resolvers += "public-jboss" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"

libraryDependencies ++= Seq(
  "org.drools" % "drools-core" % "6.3.0.Final",
  "org.drools" % "drools-compiler" % "6.3.0.Final"
)
libraryDependencies += "org.scala-lang" % "scala-swing" % "2.10+"

libraryDependencies ++= Seq(
  specs2 % Test,
  ws,
  "org.webjars" % "jquery" % "2.1.4",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0",
  "com.h2database" % "h2" % "1.4.187",
  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "org.webjars" % "requirejs" % "2.1.18",
  "org.webjars" % "react" % "0.13.3"
)