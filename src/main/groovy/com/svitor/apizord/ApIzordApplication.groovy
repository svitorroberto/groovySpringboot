package com.svitor.apizord

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration

@SpringBootApplication(exclude = [DataSourceAutoConfiguration.class])
class ApIzordApplication {

    static void main(String[] args) {
        SpringApplication.run(ApIzordApplication, args)
        println("Tá rodando, caraio")
    }

}
