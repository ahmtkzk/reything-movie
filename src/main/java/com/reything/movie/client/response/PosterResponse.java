package com.reything.movie.client.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PosterResponse {
    private double aspect_ratio;
    private int height;
    private String iso_639_1;
    private String file_path;
    private double vote_average;
    private int vote_count;
    private int width;
}
