name := """minji"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val minjiOrdersEngine = (project in file("modules/minji-orders-engine")).enablePlugins(PlayScala)
lazy val main = (project in file("."))
    .enablePlugins(PlayScala)
    .dependsOn(minjiOrdersEngine).aggregate(minjiOrdersEngine)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
