package com.measoby.designpattern;

import com.measoby.designpattern.builder.Text;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {


    public static void main(String[] args) {

         Text text = new Text.Builder()
                .setTitle("Megasoby")
                .setContent("Powerbhs")
                .setItems("olivia", "roseMarry")
                .build();

        System.out.println(text);
    }

}
