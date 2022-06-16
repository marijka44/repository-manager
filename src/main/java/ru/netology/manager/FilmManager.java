package ru.netology.manager;

public class FilmManager {

    public static void main(String[] args) {
        String[] films = {
                "Бладшот",
                "Вперед",
                "Отель Белград",
                "Джентельиены",
                "Человек-невидимка",
                "Тролли.Мировой порядок",


        };
        String newFilms = "Номер один";

        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilms;
        films = tmp;

    }

}
