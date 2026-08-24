package com.clothmarket.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server Application.
 *
 * <p>
 * Acts as the centralized service registry for the cloth marketplace
 * microservices architecture.
 * Microservices register their network locations here and discover peer
 * services dynamically.
 * </p>
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    /**
     * Entry point for launching the Eureka Service Registry.
     *
     * @param args command line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
