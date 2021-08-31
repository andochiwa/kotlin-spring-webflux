package com.github.webflux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
class SpringWebfluxApplication

fun main(args: Array<String>) {
    runApplication<SpringWebfluxApplication>(*args)
}
