name := "PlayFrameworkTest"

version := "1.0"

lazy val `playframeworktest` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

//libraryDependencies ++= Seq(
//
//  "org.springframework" % "spring-core" % "4.2.0.RELEASE"
//)

libraryDependencies ++= Seq(
  "org.springframework" % "spring-core" % "4.2.0.RELEASE",
  "org.springframework" % "spring-context" % "4.2.0.RELEASE",
  "org.springframework" % "spring-beans" % "4.2.0.RELEASE",
  "org.springframework" % "spring-jdbc" % "4.2.0.RELEASE",
  jdbc , anorm , cache , ws
)




unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )