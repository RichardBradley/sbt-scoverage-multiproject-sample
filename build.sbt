lazy val root = (project in file("."))
  .dependsOn(util)
  .aggregate(util)

lazy val util = (project in file("util"))

libraryDependencies ++= Seq(
  "org.scalatest"              %% "scalatest"              % "2.2.1"            % "test")
