package project.therasync

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties
class TherasyncGatewayApplication

fun main(args: Array<String>) {
    runApplication<TherasyncGatewayApplication>(*args)
}
