package co.develhope.apiStart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {

    @GetMapping(value = "/name")
    public String name(){
        return "Kevin Ferrer";
    }
}
