package net.hbu.live.hbuliveeurakaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HbuLiveEurakaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HbuLiveEurakaServerApplication.class, args);
    }
}
