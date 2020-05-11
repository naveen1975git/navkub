package kub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableCaching
public class KubService {

    private static final Logger log = LoggerFactory.getLogger(KubService.class);
    public static void main(String[] args) {

        log.info("Starting KubService");
        SpringApplication.run(KubService.class, args);
    }
}
