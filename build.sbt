ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "zio-chinese",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "1.0.4",
      "dev.zio" %% "zio-test" % "1.0.4" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
