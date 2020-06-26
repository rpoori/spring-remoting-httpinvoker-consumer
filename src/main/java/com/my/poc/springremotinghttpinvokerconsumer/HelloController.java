package com.my.poc.springremotinghttpinvokerconsumer;

import com.my.poc.httpinvokerclient.HelloWorldInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private HelloWorldInterface helloWorldInterface;

    @GetMapping("/hello")
    public ResponseEntity<String> getMessage(@RequestParam String name) {
        return ResponseEntity.ok(helloWorldInterface.sayHello(name));
    }
}
