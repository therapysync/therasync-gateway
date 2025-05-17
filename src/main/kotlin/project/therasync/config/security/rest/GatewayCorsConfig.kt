package project.therasync.config.security.rest

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.reactive.CorsWebFilter
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource

@Configuration
class GatewayCorsConfig {

    @Bean
    fun corsWebFilter(): CorsWebFilter {
        val config = CorsConfiguration()
        config.allowedOrigins = listOf("http://localhost:63342")  // явно домен клиента
        config.allowCredentials = true
        config.allowedHeaders = listOf("*")
        config.allowedMethods = listOf("*")

        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", config)

        return CorsWebFilter(source)
    }
}

