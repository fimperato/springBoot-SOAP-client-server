package it.fi.soap.test.documento.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * SpringBoot Application def. in caso war deployment 
 * 
 * @author Francesco
 *
 */
@SpringBootApplication
public class SpringBootWebApplicationWar extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplicationWar.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplicationWar.class, args);
    }

}
