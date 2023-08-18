import sbt.{IO, enablePlugins}
import com.typesafe.sbt.SbtNativePackager.{Universal => _, _}
import NativePackagerHelper._
import scala.io.Source

val scala3Version = "3.3.0"

lazy val root = project
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "Cyclic reference involving object",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= List("software.amazon.awssdk" % "sts" % "2.20.69")
  )
