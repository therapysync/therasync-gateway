package project.therasync.config.model

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "security")
class SecurityProperties {
    var publicPaths: List<String> = emptyList()
    var authServiceUrl: String = ""
}