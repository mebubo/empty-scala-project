scalaVersion := "2.13.6"

scalacOptions ++= Seq(
  "-language:higherKinds"
)

libraryDependencies += "com.github.fd4s" %% "fs2-kafka" % "2.1.0"
