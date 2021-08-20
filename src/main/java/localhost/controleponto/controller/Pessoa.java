package localhost.controleponto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class Pessoa {

    @GetMapping
    public String teste() {
        return "vamos testar";
    }
}