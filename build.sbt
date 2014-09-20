haxeSettings

haxeJavaSettings

haxeOptions in Compile ++= Seq("-dce", "no")

haxeOptions in Compile ++= Seq("--macro", "include('haxe.unit')")

name := "test-interface"

organization := "com.qifun.sbt-haxe"

scalacOptions += "-deprecation"

scalacOptions += "-feature"

version := "0.0.1-SNAPSHOT"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies += "org.scala-sbt" % "test-interface" % "1.0"

description := "The Haxe unit interface framework for sbt."

homepage := Some(url("https://github.com/Atry/stateless-future"))

startYear := Some(2014)

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

publishTo <<= (isSnapshot) { isSnapshot: Boolean =>
  if (isSnapshot)
    Some("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")
  else
    Some("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")
}

scmInfo := Some(ScmInfo(
  url("https://bitbucket.org/qforce/haxe-unit-interface"),
  "scm:git:https://bitbucket.org/qforce/ai-demo.git",
  Some("scm:git:git@bitbucket.org:qforce/haxe-unit-interface.git")))

pomExtra :=
  <developers>
    <developer>
      <id>chank</id>
      <name>方里权</name>
      <timezone>+8</timezone>
      <email>fangliquan@qq.com</email>
    </developer>
    <developer>
      <id>Atry</id>
      <name>杨博</name>
      <timezone>+8</timezone>
      <email>pop.atry@gmail.com</email>
    </developer>
  </developers>
