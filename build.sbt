name := "data_warehouse"

version := "0.1"

scalaVersion := "2.12.14"

organization := "com.databricks.blog"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-sql_2.12" % "3.2.0" % "provided")