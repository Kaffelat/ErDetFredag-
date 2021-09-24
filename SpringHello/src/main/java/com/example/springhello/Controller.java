package com.example.springhello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

// Opgave 1.1
@RestController
public class Controller {
    @GetMapping("/first-Mapping")
    public String firstMapping(){
        return "Hello world ^^";
    }
    //Opgave 1.2
    @GetMapping("/parameter")
    //for at få den her frem skal du skrive localhost:8080/parameter?param="input"
    public String parameter(@RequestParam String param){
        return param;
    }
    @GetMapping("/")
    public String index(){
        return "You du er ved startsiden homie";
    }
    

}
