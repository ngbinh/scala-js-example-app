import sbt.Keys._

lazy val example = crossProject.in(file("example"))
  .settings(
    name := "Example",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.8",
//    testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD"),
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % "3.0.0-M15" % "test"
    )
  )

lazy val exampleJvm = example.jvm
lazy val exampleJs = example.js

lazy val root = project.in(file("."))
    .aggregate(exampleJs, exampleJvm)
