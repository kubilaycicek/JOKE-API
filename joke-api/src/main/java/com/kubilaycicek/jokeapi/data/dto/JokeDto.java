package com.kubilaycicek.jokeapi.data.dto;

import java.util.List;

public record JokeDto(List<String> categories, String created_at, String icon_url, String id,
                      String updatedAt, String value) {

}