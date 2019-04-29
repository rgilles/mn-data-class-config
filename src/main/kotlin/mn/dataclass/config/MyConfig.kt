package mn.dataclass.config

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("dataclass")
data class MyConfig(val name:String)