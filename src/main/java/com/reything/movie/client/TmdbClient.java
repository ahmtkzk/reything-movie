package com.reything.movie.client;

import com.reything.movie.config.FeignConfiguration;
import com.reything.movie.model.dto.ResultDTO;
import com.reything.movie.model.enums.ExternalIdSource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://api.themoviedb.org/3", name = "tmdb-api", configuration = {FeignConfiguration.class})
public interface TmdbClient {

    @GetMapping("/discover/movie")
    ResponseEntity<ResultDTO> getMovieList(
            @RequestParam(name = "page", required = false) Integer page,
            @RequestParam(name = "year", required = false) Integer year
    );

    @GetMapping("/find/{external_id}")
    ResponseEntity<ResultDTO> getExternalMovieById( //TODO Return types will change.
            @PathVariable(name = "external_id") String external_id,
            @RequestParam(name = "external_source") ExternalIdSource externalSource);

    @GetMapping("/genre/movie/list")
    ResponseEntity<ResultDTO> getMovieGenreList();//TODO Return types will change.

    @GetMapping("/movie/popular")
    ResponseEntity<ResultDTO> getPopularMovieList(//TODO Return types will change.
            @RequestParam(name = "page", required = false) Integer page,
            @RequestParam(name = "year", required = false) Integer year
    );

    @GetMapping("/movie/{movie_id}")
    ResponseEntity<ResultDTO> getMovieDetailById(//TODO Return types will change.
            @PathVariable(name = "movie_id") int movieId
    );

    @GetMapping("/movie/{movie_id}/external_ids")
    ResponseEntity<ResultDTO> getMovieExternalIdListByTmdbId(//TODO Return types will change.
            @PathVariable(name = "movie_id") int movie_id
    );

    @GetMapping("/movie/{movie_id}/keywords")
    ResponseEntity<ResultDTO> getMovieKeywordList(//TODO Return types will change.
            @PathVariable(name = "movie_id") int movie_id
    );

    @GetMapping("/movie/{movie_id}/images")
    ResponseEntity<ResultDTO> getMovieImageList( //TODO Return types will change.
            @PathVariable(name = "movie_id") int movie_id
    );
}
