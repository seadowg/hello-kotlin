package com.seadowg.hellokotlin

import spark.Spark.*

fun main(args: Array<String>) {
  get("/", { req, res -> "Hello World!" }) 
}
