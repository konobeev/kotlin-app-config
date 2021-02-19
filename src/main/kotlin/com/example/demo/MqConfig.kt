package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.validation.annotation.Validated

@Validated
@ConstructorBinding
@ConfigurationProperties(prefix = "mq")
data class MqConfig(val factory:MqFactory, val topic: MqTopic)

@Validated
@ConstructorBinding
data class MqFactory(val url:String, val port:Int)

@Validated
@ConstructorBinding
data class MqTopic(val name:String, val group:String)
