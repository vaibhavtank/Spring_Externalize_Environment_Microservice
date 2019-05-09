package com.env.conf;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Value(value = "${spring.database.url}")
    String dbName;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("************"+dbName+"*************");
    }
}
