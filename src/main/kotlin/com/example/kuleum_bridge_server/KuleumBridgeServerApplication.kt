package com.example.kuleum_bridge_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class KuleumBridgeServerApplication

fun main(args: Array<String>) {
    runApplication<KuleumBridgeServerApplication>(*args)
}
