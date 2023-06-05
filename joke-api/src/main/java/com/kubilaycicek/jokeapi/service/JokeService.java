package com.kubilaycicek.jokeapi.service;

import com.kubilaycicek.jokeapi.dto.Category;
import com.kubilaycicek.jokeapi.dto.JokeDto;

import java.util.List;

public interface JokeService {
    List<Category> getCategories();
    JokeDto getRandomJoke();
    JokeDto getRandomJokeByCategory(String category);
}
