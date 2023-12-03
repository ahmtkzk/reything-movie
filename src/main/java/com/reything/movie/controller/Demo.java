package com.reything.movie.controller;

import com.reything.movie.client.response.MovieResponse;
import com.reything.movie.service.TmdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @Autowired
    TmdbService tmdbService;

    @GetMapping("/demo/{id}")
    public ResponseEntity<MovieResponse> sad(
            @PathVariable(name = "id") int id) {
        return ResponseEntity.ok(tmdbService.demo(id));
    }

}
