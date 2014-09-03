import play.Project._

name := "everyground2"

version := "1.0"

libraryDependencies ++= Seq(
   javaJdbc,
   "mysql" % "mysql-connector-java" % "5.1.30")

libraryDependencies ++= Seq( jdbc, anorm )

playScalaSettings