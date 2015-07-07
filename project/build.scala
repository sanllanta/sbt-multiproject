import sbt._
import Keys._

object Build extends Build {

	lazy val commonSettings = Seq(
		organization := "co.s4n.cap",
		version := "0.0.1",
		scalaVersion := "2.11.6",
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
		)

	lazy val root = Project("ab-container", file(".")).
	settings(commonSettings: _*).
	settings(
		name := "ab-container"
		).aggregate(remote_project, local_project)
	
	lazy val remote_project = Project("main").
	settings(commonSettings: _*).
	settings(
		resolvers += "Nexus Releases" at "http://nexus.seven4n.com/content/repositories/s4n-capacitaciones/sv/",
		libraryDependencies += "co.s4n" %% "scala-basic-project" % "0.0.1"
		)

	lazy val local_project = Project("b", file("project-b")).
	settings(commonSettings: _*).
	settings(
			
		)
}