val ScalatraVersion = "$scalatra_version$"

ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / organization := "$organization$"

lazy val hello = (project in file("."))
  .settings(
    name := "$name$",
    version := "$version$",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra-jakarta" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest-jakarta" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.5.6" % "runtime",
      "jakarta.servlet" % "jakarta.servlet-api" % "6.0.0" % "provided"
    ),
  )

enablePlugins(SbtTwirl)
enablePlugins(SbtWar)

Test / fork := true
