package com.example.demo

import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class MyService(val jmsConfig: JmsConfig, val mqConfig: MqConfig) {
    val user = jmsConfig.user
    val delay = jmsConfig.primary.delay

    @PostConstruct
    fun init() {
        println("$user -> $delay")
        println(jmsConfig)
        println(mqConfig)
    }

}