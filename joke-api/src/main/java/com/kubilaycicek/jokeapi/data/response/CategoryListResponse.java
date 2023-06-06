package com.kubilaycicek.jokeapi.data.response;

import com.kubilaycicek.jokeapi.data.dto.Category;

import java.util.List;

public record CategoryListResponse(List<Category> categories) {
}
