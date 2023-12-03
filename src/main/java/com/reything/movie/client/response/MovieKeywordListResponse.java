package com.reything.movie.client.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MovieKeywordListResponse {
    private int id;
    private List<KeywordResponse> keywords;
}