scalaVersion := "2.13.6"

scalacOptions ++= Seq(
  "-language:higherKinds"
)

libraryDependencies += "com.github.fd4s" %% "fs2-kafka" % "2.2.0"
libraryDependencies += "co.fs2" %% "fs2-core" % "3.1.2"
libraryDependencies += "co.fs2" %% "fs2-io" % "3.1.2"

libraryDependencies += "org.tpolecat" %% "natchez-core" % "0.1.5"
libraryDependencies += "org.tpolecat" %% "skunk-core" % "0.2.2"
libraryDependencies += "org.tpolecat" %% "pool-party" % "0.0.3"
