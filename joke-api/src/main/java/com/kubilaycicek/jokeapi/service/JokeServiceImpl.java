package com.kubilaycicek.jokeapi.service;

import com.kubilaycicek.jokeapi.constants.JokeApiConstant;
import com.kubilaycicek.jokeapi.dto.Category;
import com.kubilaycicek.jokeapi.dto.JokeDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class JokeServiceImpl implements JokeService {
    private final RestTemplate restTemplate;

    public JokeServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Cacheable("categories")
    @Override
    public List<Category> getCategories() {
        return List.of(Category.values());
    }

    public JokeDto getRandomJoke() {
        return restTemplate.getForEntity(JokeApiConstant.JOKE_API_URL, JokeDto.class).getBody();
    }

    @Override
    public JokeDto getRandomJokeByCategory(String category) {
        return restTemplate.getForEntity(JokeApiConstant.JOKE_API_URL, JokeDto.class).getBody();
    }

}