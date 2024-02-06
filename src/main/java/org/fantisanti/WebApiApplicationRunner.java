package org.fantisanti;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.fantisanti")

public class WebApiApplicationRunner {
    public static void main(String[] args) {

        SpringApplication.run(WebApiApplicationRunner.class, args);

    }
}
