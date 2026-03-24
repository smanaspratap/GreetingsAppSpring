package com.example.GreetingsAppSpring.controller;

import org.springframework.web.bind.annotation.*;
import com.example.GreetingsAppSpring.model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // GET - http://localhost:8080/hello
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello from BridgeLabz!!!";
    }

    // GET - http://localhost:8080/hello/query?name=Manas
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String sayHelloQuery(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    // GET - http://localhost:8080/hello/param/Manas
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // POST - http://localhost:8080/hello/post
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    // PUT - http://localhost:8080/hello/put/Manas?lastName=Singh
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,
                              @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
