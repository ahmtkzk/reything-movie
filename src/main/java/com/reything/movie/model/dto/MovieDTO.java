package com.reything.movie.model.dto;

import lombok.Data;

@Data
public class MovieDTO {
    private Long key;
    private Boolean adult; //Yetişkin İçerik
    private String poster_path; //Poster yolu
    private Integer id; //Film TMDb ID’si
    private String overview; //Özet açıklama
    private String release_date; //Çıkış tarihi
    private String title; //Film başlığı
    private Integer budget; //Film bütçe bilgisi - Detail servisten alınacak.
    private String original_language; //Orginal dil
    private String original_title; //Orjinal dildeki başlığı
    private String tagline; //Var ise, film ile ilgili ufak bir söz. - Detail servisten alınacak.
    //private List<GenreEntity> genres; // Film türleri.
    private Integer benim_id; //Benim veritabanında tutulacak olan id.
}
