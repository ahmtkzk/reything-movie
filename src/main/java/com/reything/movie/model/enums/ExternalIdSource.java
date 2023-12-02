package com.reything.movie.model.enums;

public enum ExternalIdSource {
    IMDb("imdb_id"),
    Facebook("facebook_id"),
    Instagram("instagram_id"),
    TheTVDB("tvdb_id"),
    TikTok("tiktok_id"),
    Twitter("twitter_id"),
    Wikidata("wikidata_id"),
    YouTube("youtube_id");

    private final String value;

    ExternalIdSource(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
