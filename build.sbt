scalaVersion := "2.12.14"
scalacOptions ++= Seq(
  "-language:higherKinds"
)

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.2"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.2"
