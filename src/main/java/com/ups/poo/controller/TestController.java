package com.ups.poo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.MidiFileFormat;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello world, this is my first Project!....";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name,
                        @RequestParam String lastname,
                        @RequestParam(required = false) Integer Age) {
        String message = "This is my first SpringBootProject!" +
                ", and my name is: " + name + " " + lastname;
        if (Age != 0) {
            message = message + " and my age is " + Age;
        }
        return message;
    }

    @GetMapping("/concat/{name}/{lastname}/{age}")
    public String concatenate(@PathVariable String name,
                              @PathVariable String lastname,
                              @PathVariable int age) {
        return "This is my second rest service!, and my name is "
                + name + " " + lastname + " and my age is: " + age;
    }
}
