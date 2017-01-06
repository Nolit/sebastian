name := "sebastian"

version := "1.0"

scalaVersion := "2.12.1"

//val test = "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-swing" % "2.9.2"
)

//javacOptions ++= Seq("-source", "1.7", "-target", "1.7", "-encoding", "UTF-8")

scalacOptions ++= Seq("-deprecation", "-encoding", "UTF-8")