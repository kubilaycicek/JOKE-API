package com.kubilaycicek.jokeapi.dto;

public enum Category {
    ANIMAL(0), CAREER(1), CELEBRITY(2), DEV(3), EXPLICIT(4),
    FASHION(5), FOOD(6), HISTORY(7), MONEY(8), MOVIE(9), MUSIC(10),
    POLITICIAL(11), RELIGION(12), SCIENCE(13), SPORT(14), TRAVEL(15);

    private final int value;

    Category(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
