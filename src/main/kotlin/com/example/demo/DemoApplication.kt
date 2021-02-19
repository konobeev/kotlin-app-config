package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(JmsConfig::class, MqConfig::class)
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
