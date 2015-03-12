package com.seadowg.hellokotlin

import spark.Spark.*
import spark.SparkBase.port

fun main(args: Array<String>) {
  port(Integer.parseInt(System.getenv().get("PORT")))

  get("/", { req, res -> "Hello World!" })
}
