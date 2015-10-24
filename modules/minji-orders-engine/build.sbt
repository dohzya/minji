name := "minji-orders-engine"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
