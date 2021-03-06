package org.exampledriven.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringBootExampleApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringBootExampleApplication.class);

    public static void main(String[] args) {

        new SpringApplicationBuilder()
                .sources(SpringBootExampleApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

//        SpringApplication.run(SpringBootExampleApplication.class, args);
        logger.info("After run method2");
    }

}
