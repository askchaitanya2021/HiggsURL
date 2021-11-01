package com.askchaitanya.HiggsURL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.askchaitanya.HiggsURL"
})
public class HiggsURLApplication {
    public static void main(String[] args) {
        SpringApplication.run(HiggsURLApplication.class, args);
    }
}