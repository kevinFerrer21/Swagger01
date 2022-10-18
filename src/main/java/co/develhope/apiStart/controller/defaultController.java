package co.develhope.apiStart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class defaultController {
    @GetMapping(value  = "/default")
    public String getWelcomeMessage(){
        return "Hi there!!!";
    }
}
