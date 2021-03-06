sbtPlugin := true

name := "sbt-ctags"

organization := "net.nightwhistler"

description := "An SBT plugin to generate ctags for a project (including its dependencies)"

homepage := Some(url("https://github.com/nightwhistler/sbt-ctags"))

startYear := Some(2014)

licenses := Seq(
  ("GPLv3", url("http://www.gnu.org/licenses/gpl-3.0.txt"))
)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/nightwhistler/sbt-ctags"),
    "scm:git:https://github.com/nightwhistler/sbt-ctags.git",
    Some("scm:git:git@github.com:nightwhistler/sbt-ctags.git")
  )
)

scalaVersion := "2.12.4"

sbtVersion in Global := "1.0.3"

scalaCompilerBridgeSource := {
  val sv = appConfiguration.value.provider.id.version
  ("org.scala-sbt" % "compiler-interface" % sv % "component").sources
}

crossSbtVersions := Vector("0.13.16 ", "1.0.3")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-encoding", "UTF-8"
)

/* publishing */
publishMavenStyle := true
publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <developers>
    <developer>
      <id>ceedubs</id>
      <name>Cody Allen</name>
      <email>ceedubs@gmail.com</email>
    </developer>
  </developers>
)
