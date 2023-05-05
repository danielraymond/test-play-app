import CiCommands._

name := """test-play-app"""

scalaVersion := "2.13.10"
organization := "daniel.raymond"
evictionErrorLevel := Level.Error

version := "1.0-SNAPSHOT"

lazy val app = (project in file("""app"""))
  .enablePlugins(PlayScala, sbtdocker.DockerPlugin)
  .settings(
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test,
      "org.scalatest" %% "scalatest" % "3.2.15" % Test
    ),
    dependencyOverrides ++= Seq("org.scala-lang.modules" %% "scala-xml" % "2.1.0"),
    coverageExcludedPackages := "<empty>;Reverse.*;router\\.*",
    coverageMinimumStmtTotal := 100,
    coverageFailOnMinimum := true,
  )

lazy val root = (project in file("."))
  .aggregate(app)
  .settings(commands ++= Seq(devComplete))
