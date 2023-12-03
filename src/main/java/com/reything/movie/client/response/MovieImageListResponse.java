package com.reything.movie.client.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MovieImageListResponse {
    private List<BackdropResponse> backdrops;
    private int id;
    private List<PosterResponse> posters;
}
