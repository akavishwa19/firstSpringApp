package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(Main.class,args);
    }
@GetMapping("/greet")
    public GreetResponse greet(){
        return new GreetResponse("hello",List.of("java","python","c"),new Person("abhay"));
    }
    record Person(String name){

    }
    record GreetResponse(String greet, List<String> favprogramminglanguages,Person person){
    }
}
