package com.reything.movie.service;

import com.reything.movie.client.TmdbClient;
import com.reything.movie.client.response.MovieResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final TmdbClient tmdbClient;

    public MovieService(TmdbClient tmdbClient) {
        this.tmdbClient = tmdbClient;
    }

    public List<MovieResponse> getMovieList(Integer page, Integer year) {
        return (page != null && year != null) ? tmdbClient.getMovieList(page, year).getResults() : tmdbClient.getMovieList(1, 2023).getResults();
    }

}
