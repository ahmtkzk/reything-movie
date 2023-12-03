package com.reything.movie.client.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PopularMovieListResponse {
    private int page;
    private List<MovieResponse> results;
    private int total_pages;
    private int total_results;
}
