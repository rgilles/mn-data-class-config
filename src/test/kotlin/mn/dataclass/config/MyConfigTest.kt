package mn.dataclass.config

import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

/**
 * This test demonstrate the issue on configuration with Kotlin data class
 */
@MicronautTest
class MyConfigTest {

    @Inject
    lateinit var config: MyConfig

    @Test
    fun `when inject data class configuration expect name equal to micronaut`() {
        assertEquals("micronaut", config.name)
    }
}