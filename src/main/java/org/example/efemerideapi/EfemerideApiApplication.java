package org.example.efemerideapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class EfemerideApiApplication {


    public static void main(String[] args) {

        SpringApplication.run(EfemerideApiApplication.class, args);


    }
}
