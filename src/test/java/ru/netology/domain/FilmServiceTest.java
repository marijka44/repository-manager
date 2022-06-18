package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class FilmServiceTest {


    @Test
    public void addOneFilmShouldAddOneFilm(){
        FilmManager manager = new FilmManager();

        manager.add("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllShouldReturnCorrectAllAddedFilms(){
        FilmManager manager = new FilmManager();

        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельиены");
        manager.add("Человек-невидимка");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельиены", "Человек-невидимка"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastShouldReturnCorrectLastFiveFilms(){
        FilmManager manager = new FilmManager(5);

        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельиены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой порядок");
        manager.add("Номер один");
        manager.add("Матрица");
        manager.add("Властелин колец");
        manager.add("Зеленая миля");

        String[] expected = {"Зеленая миля", "Властелин колец", "Матрица", "Номер один", "Тролли.Мировой порядок"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastShouldReturnCorrectLastOverLimitFilms(){
        FilmManager manager = new FilmManager(11);

        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельиены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой порядок");
        manager.add("Номер один");
        manager.add("Матрица");
        manager.add("Властелин колец");
        manager.add("Зеленая миля");

        String[] expected = {"Зеленая миля", "Властелин колец", "Матрица", "Номер один", "Тролли.Мировой порядок", "Человек-невидимка", "Джентельиены", "Отель Белград", "Вперед","Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
