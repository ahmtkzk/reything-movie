package com.reything.movie.controller;

import com.reything.movie.client.response.MovieResponse;
import com.reything.movie.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    @Operation(hidden = true, description = "Redirection URL for Swagger")
    public RedirectView redirectViewToSwagger() {
        return new RedirectView("http://localhost:8080/swagger-ui/index.html");
    }

    @GetMapping("/movie-list")
    public ResponseEntity<List<MovieResponse>> sad(
            @RequestParam(name = "page", required = false) Integer page,
            @RequestParam(name = "year", required = false) Integer year) {
        return ResponseEntity.ok(movieService.getMovieList(page, year));
    }

}
