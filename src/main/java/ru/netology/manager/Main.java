package ru.netology.manager;

public class Main {

    public static void main(String[] args) {
        MovieTitleItem first = new MovieTitleItem(10, 1, "first");
        MovieTitleItem second = new MovieTitleItem(20, 2 , "second");
        MovieTitleItem third = new MovieTitleItem(30, 3, "third");
        MovieTitleItem fourth = new MovieTitleItem(40, 4, "fourth");
        MovieTitleItem fifth = new MovieTitleItem(50, 5, "fifth");
        MovieTitleItem sixth = new MovieTitleItem(60, 6, "sixth");



        FilmRepository repo = new FilmRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);
        repo.save(sixth);

        repo.removeById(20);

       MovieTitleItem[] all = repo.findAll();

    }

}
