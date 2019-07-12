name := "akka-bugnsga-sample"

version := "1.0"

scalaVersion := "2.12.8"

lazy val akkaVersion = "2.5.23"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.bugsnag" % "bugsnag" % "3.5.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
