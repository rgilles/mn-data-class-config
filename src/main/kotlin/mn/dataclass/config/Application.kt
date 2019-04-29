package mn.dataclass.config

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("mn.data.class.config")
                .mainClass(Application.javaClass)
                .start()
    }
}