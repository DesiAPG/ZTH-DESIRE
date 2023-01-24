package com.spring.zthdesire.Controller;

import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
class RestControllerTest {
    @GetMapping("/")
    public String wave(){
        return "Hi from spring";
    }

    @GetMapping("/shop")
    public String shop(){
        return "Welcome to the shop";
    }
}
