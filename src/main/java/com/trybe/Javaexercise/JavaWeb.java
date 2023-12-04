package com.trybe.Javaexercise;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/javaweb")
public class JavaWeb {

@GetMapping
public String javaweb() {
    return "Estou aprendendo a criar aplicações Java para a Web!";
}

}
