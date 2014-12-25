name := "toggl-cli"

version := "0.1"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
  "net.liftweb" % "lift-json_2.11" % "2.6-RC1",
  "joda-time" % "joda-time" % "2.0",
  "org.joda" % "joda-convert" % "1.7",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.slf4j" % "slf4j-log4j12" % "1.7.9"
)


