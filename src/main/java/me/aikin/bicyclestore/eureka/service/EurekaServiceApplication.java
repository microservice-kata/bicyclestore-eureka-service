package me.aikin.bicyclestore.eureka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {
    public static void main(String[] args) {

        SpringApplication.run(EurekaServiceApplication.class, args);

        log.info("max memory:{} MB", Runtime.getRuntime().maxMemory() / 1024 / 1024);
        log.info("total memory:{} MB", Runtime.getRuntime().totalMemory() / 1024 / 1024);
        log.info("free memory:{} MB", Runtime.getRuntime().freeMemory() / 1024 / 1024);
        log.info("used memory:{} MB", (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024);
        log.info("available processors:{}", Runtime.getRuntime().availableProcessors());
    }
}
