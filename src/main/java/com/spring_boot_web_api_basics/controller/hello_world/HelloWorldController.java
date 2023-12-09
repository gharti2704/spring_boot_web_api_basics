package com.spring_boot_web_api_basics.controller.hello_world;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class HelloWorldController {

    @GetMapping("hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("hello/{name}")
    public ResponseEntity<String> sayHelloWithName(@PathVariable String name) {

        String newName = name.substring(0, 1).toUpperCase() + name.substring(1);
        return ResponseEntity.ok("Hello, " + newName);
    }
}
