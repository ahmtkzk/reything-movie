package com.reything.movie.service;

import com.reything.movie.client.TmdbClient;
import org.springframework.stereotype.Service;

@Service
public class TmdbService {

    private final TmdbClient tmdbClient;

    public TmdbService(TmdbClient tmdbClient) {
        this.tmdbClient = tmdbClient;
    }

}
