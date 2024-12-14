package com.kensuuu.grpckotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrpcKotlinApplication

fun main(args: Array<String>) {
    runApplication<GrpcKotlinApplication>(*args)
}
