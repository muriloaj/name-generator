package com.github.muriloaj.namegenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NameGeneratorApplication

fun main(args: Array<String>) {
    runApplication<NameGeneratorApplication>(*args)
}
