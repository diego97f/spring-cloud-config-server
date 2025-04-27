package com.github.springcloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Config Server Application
 * 
 * This application serves as a centralized configuration server for distributed systems
 * using Spring Cloud Config. It provides the following capabilities:
 * 
 * - Externalized configuration for multiple applications and environments
 * - Git-backed configuration storage with automatic updates
 * - Secure access through Basic Authentication
 * - Health monitoring and metrics endpoints
 * 
 * The server runs on port 8888 by default and requires proper authentication credentials
 * which can be configured through environment variables:
 * - CONFIG_SERVER_USERNAME
 * - CONFIG_SERVER_PASSWORD
 * 
 * @see org.springframework.cloud.config.server.EnableConfigServer
 * @version 0.0.1-SNAPSHOT
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerApplication.class, args);
    }

}
