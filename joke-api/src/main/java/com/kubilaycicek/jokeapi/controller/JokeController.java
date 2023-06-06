package com.kubilaycicek.jokeapi.controller;


import com.kubilaycicek.jokeapi.data.request.JokeRequest;
import com.kubilaycicek.jokeapi.data.response.CategoryListResponse;
import com.kubilaycicek.jokeapi.data.response.JokeResponse;
import com.kubilaycicek.jokeapi.service.JokeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("joke-app/")
public class JokeController {

    private final JokeService jokeService;
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("categories")
    public ResponseEntity<CategoryListResponse> getCategories() {
        return new ResponseEntity<>(new CategoryListResponse(jokeService.getCategories()), HttpStatus.OK);
    }

    @GetMapping("random-joke")
    public ResponseEntity<JokeResponse> getRandomJoke() {
        return new ResponseEntity<>(new JokeResponse(jokeService.getRandomJoke().value()), HttpStatus.OK);
    }

    @GetMapping("random-joke-by-category")
    public ResponseEntity<JokeResponse> getRandomJokeByCategory(@RequestBody JokeRequest request) {
        return new ResponseEntity<>(new JokeResponse(jokeService.getRandomJokeByCategory(request.category()).value()), HttpStatus.OK);
    }
}
