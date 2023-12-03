package com.reything.movie.client.response.enums;

import lombok.Getter;

@Getter
public enum ExternalIdSourceResponse {
    IMDb("imdb_id"),
    Facebook("facebook_id"),
    Instagram("instagram_id"),
    TheTVDB("tvdb_id"),
    TikTok("tiktok_id"),
    Twitter("twitter_id"),
    Wikidata("wikidata_id"),
    YouTube("youtube_id");

    private final String value;

    ExternalIdSourceResponse(String value) {
        this.value = value;
    }
}
