package com.reything.movie.client.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FindExternalIdResponse {
    private List<MovieResponse> movie_results;
    private List<Object> person_results;
    private List<Object> tv_results;
    private List<Object> tv_episode_results;
    private List<Object> tv_season_results;
}
