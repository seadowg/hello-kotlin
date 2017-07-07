package com.seadowg.hellokotlin

import spark.Spark.*
import spark.SparkBase.port

fun main(args: Array<String>) {
  val sysPort: String = System.getenv().get("PORT") ?: "4567"

  port(Integer.parseInt(sysPort))

  get("/", { req, res -> "Hello World!" })
}
