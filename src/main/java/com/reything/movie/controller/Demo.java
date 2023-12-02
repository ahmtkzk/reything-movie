package com.reything.movie.controller;

import com.reything.movie.service.TmdbService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/demo")
    public ResponseEntity<String> sad() {
        return ResponseEntity.ok("Demo");
    }

}
