package com.kubilaycicek.jokeapi.constants;

public class JokeApiConstant {
    private JokeApiConstant() {
    }
    public static final String JOKE_API_URL = "https://api.chucknorris.io/jokes/random";
    public static final String CATEGORY_URL= JOKE_API_URL+"?category?=";
}