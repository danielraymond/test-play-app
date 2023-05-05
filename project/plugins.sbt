addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.19")
addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.10.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")
addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "2.0.5")

dependencyOverrides ++= Seq("org.scala-lang.modules" %% "scala-xml" % "2.1.0")
