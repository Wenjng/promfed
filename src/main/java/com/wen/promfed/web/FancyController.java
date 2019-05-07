package com.wen.promfed;

import org.springframework.web.bind.annotation.*;

@RestController
public class FancyController {

    @GetMapping("/hello")
    public String handle() {
        return "Hello WebFlux";
    }

    @GetMapping("/runner/{bib}")
    public String searchRunner(@PathVariable Integer bib) {
        return "Hello John. Thank you for your registration and your bib is " + bib;
    }

}