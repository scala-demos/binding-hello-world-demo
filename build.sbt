name := "Binding Hello World Demo"

version := "0.1"

organization := "org.my"

scalaVersion := "2.12.4"

sbtVersion := "1.0.4"

enablePlugins(ScalaJSPlugin)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

skip in packageJSDependencies := false

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "be.doeraene" %%% "scalajs-jquery" % "0.9.1",
  "com.thoughtworks.binding" %%% "dom" % "11.0.1",
  "com.thoughtworks.binding" %%% "binding" % "11.0.1",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)

jsDependencies ++= Seq(
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

