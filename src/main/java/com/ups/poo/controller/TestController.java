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
        return "Hello teacher, this is my Project!....";
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
    @GetMapping("/my-information")
    public String myInformation(@RequestParam String name,
                        @RequestParam(required = false) String lastname,
                        @RequestParam(required = false) Integer Age) {
        String message = "Hello teacher, this is my first SpringBootProject!" +
                ", and my name is: " + name;
        if (lastname != null){
            message =  message + " " + lastname;
        }
        if (Age != null) {
            message = message + " and my age is " + Age;
        }
        return message;
    }

    /*
    @GetMapping("/concat/{name}/{lastname}/{age}")
    public String concatenate(@PathVariable String name,
                              @PathVariable String lastname,
                              @PathVariable int age) {
        return "This is my second rest service!, and my name is "
                + name + " " + lastname + " and my age is: " + age;
    }

     */
    @GetMapping("/concat1/{name}/{lastname}/{age}")
    public String concatenate1(@PathVariable String name,
                              @PathVariable(required = false) String lastname,
                              @PathVariable(required = false) Integer age) {
        String message = "This is my frist SpringBootProyect and my name is: " + name;
        if (lastname != null){
             message =  message + ", my last name is " + lastname;
        }
        if (age != null) {
            message = message + " and my age is " + age;
        }
        return message;
    }
}
