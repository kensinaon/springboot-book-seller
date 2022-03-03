package com.sinaon.bookseller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author ksinaon
 * @Created 2/16/2022
 */
@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class BookSellerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSellerApplication.class, args);
    }


}
