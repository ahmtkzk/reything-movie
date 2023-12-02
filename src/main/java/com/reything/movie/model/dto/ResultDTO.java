package com.reything.movie.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResultDTO {
    private Integer page;
    private List<MovieDTO> results;
    private Integer total_pages;
    private Integer total_results;
}
