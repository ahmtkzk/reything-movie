package com.reything.movie.client;

import com.reything.movie.client.response.*;
import com.reything.movie.config.FeignConfiguration;
import com.reything.movie.client.response.enums.ExternalIdSourceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://api.themoviedb.org/3", name = "tmdb-api", configuration = {FeignConfiguration.class})
public interface TmdbClient {

    @GetMapping("/discover/movie")
    ResponseEntity<DiscoverMovieResponse> getMovieList(
            @RequestParam(name = "page", required = false) Integer page,
            @RequestParam(name = "year", required = false) Integer year
    );

    @GetMapping("/find/{external_id}")
    ResponseEntity<FindExternalIdResponse> getExternalMovieById(
            @PathVariable(name = "external_id") String external_id,
            @RequestParam(name = "external_source") ExternalIdSourceResponse externalSource);

    @GetMapping("/genre/movie/list")
    ResponseEntity<GenreMovieListResponse> getMovieGenreList();

    @GetMapping("/movie/popular")
    ResponseEntity<PopularMovieListResponse> getPopularMovieList(
            @RequestParam(name = "page", required = false) Integer page,
            @RequestParam(name = "year", required = false) Integer year
    );

    @GetMapping("/movie/{movie_id}")
    ResponseEntity<MovieResponse> getMovieDetailById(
            @PathVariable(name = "movie_id") int movieId
    );

    @GetMapping("/movie/{movie_id}/external_ids")
    ResponseEntity<MovieExternalIdListResponse> getMovieExternalIdListByTmdbId(
            @PathVariable(name = "movie_id") int movie_id
    );

    @GetMapping("/movie/{movie_id}/keywords")
    ResponseEntity<MovieKeywordListResponse> getMovieKeywordList(
            @PathVariable(name = "movie_id") int movie_id
    );

    @GetMapping("/movie/{movie_id}/images")
    ResponseEntity<MovieImageListResponse> getMovieImageList(
            @PathVariable(name = "movie_id") int movie_id
    );
}
