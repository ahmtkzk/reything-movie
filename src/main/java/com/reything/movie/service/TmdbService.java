package com.reything.movie.service;

import com.reything.movie.client.TmdbClient;
import com.reything.movie.client.response.MovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TmdbService {

    @Autowired
    private TmdbClient tmdbClient;

    public MovieResponse demo(int id) {
        return tmdbClient.getMovieDetailById(id).getBody();
    }

}
