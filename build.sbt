lazy val root = project
  .in(file("."))
  .settings(
    name := "Cyclic reference involving object",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.3.0", // "2.13.11", // "3.3.0"
    libraryDependencies ++= List("software.amazon.awssdk" % "sts" % "2.20.69")
  )
