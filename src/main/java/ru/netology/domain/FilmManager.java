package ru.netology.domain;

import java.util.*;

public class FilmManager {

    private final int lastAddedFilmsCount;
    private final int LIMIT_DEFAULT = 10;

    private String[] films = new String[0];

    public FilmManager() {
        this.lastAddedFilmsCount = this.LIMIT_DEFAULT;
    }

    public FilmManager(int limit) {
        this.lastAddedFilmsCount = limit;
    }

    public void add(String filmName) {
        String[] result = Arrays.copyOf(this.films, this.films.length + 1);
        result[this.films.length] = filmName;
        this.films = result;
    }

    public String[] findAll() {
        return this.films;
    }

    public String[] findLast() {
        int resultLength;
        int filmLength = this.films.length;
        if (filmLength >= this.lastAddedFilmsCount) {
            resultLength = this.lastAddedFilmsCount;
        } else {
            resultLength = filmLength;
        }

        String[] resultList = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            resultList[i] = (this.films[filmLength - i - 1]);
        }

        return resultList;
    }

}