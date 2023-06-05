package com.kubilaycicek.jokeapi.response;

import com.kubilaycicek.jokeapi.dto.Category;

import java.util.List;

public record CategoryListResponse(List<Category> categories) {
}
