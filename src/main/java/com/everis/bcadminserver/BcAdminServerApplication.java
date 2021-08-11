package com.everis.bcadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAdminServer
@SpringBootApplication
public class BcAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BcAdminServerApplication.class, args);
    }

}
