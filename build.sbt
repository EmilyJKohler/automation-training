
import play.core.PlayVersion

name := "Applications"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "info.cukes" %% "cucumber-scala" % "1.2.5",
  "org.seleniumhq.selenium" % "selenium-java" % "3.14.0",
  "info.cukes" % "cucumber-junit" % "1.2.5",
  "com.typesafe.play" %% "play-test" % PlayVersion.current,
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP10"
)

