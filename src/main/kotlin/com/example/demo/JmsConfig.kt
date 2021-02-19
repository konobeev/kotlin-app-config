package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.convert.DurationUnit
import org.springframework.validation.annotation.Validated
import java.time.Duration
import java.time.temporal.ChronoUnit

@Validated
@ConstructorBinding
@ConfigurationProperties(prefix = "jms")
data class JmsConfig(
        val url: String,
        val user: String,
        val primary: Connectivity,
        val secondary: Connectivity)

@Validated
@ConstructorBinding
data class Connectivity(@DurationUnit(ChronoUnit.MILLIS)
                        val delay: Duration,
                        @DurationUnit(ChronoUnit.DAYS)
                        val timeout: Duration)