
package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesServiceTest {
    @Test
    public void shouldFindAll() {

        MoviesService moviesService = new MoviesService();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентельмены";

        moviesService.add(movie1);
        moviesService.add(movie2);
        moviesService.add(movie3);

        String[] actual = moviesService.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLessLimit() {

        MoviesService moviesService = new MoviesService();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентельмены";

        moviesService.add(movie1);
        moviesService.add(movie2);
        moviesService.add(movie3);

        String[] actual = moviesService.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindALastMoreLimit() {

        MoviesService moviesService = new MoviesService(6);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентельмены";
        String movie4 = "Человек-невидимка";
        String movie5 = "Тролли";
        String movie6 = "Номер один";
        String movie7 = "Отель";


        moviesService.add(movie1);
        moviesService.add(movie2);
        moviesService.add(movie3);
        moviesService.add(movie4);
        moviesService.add(movie5);
        moviesService.add(movie6);
        moviesService.add(movie7);


        String[] actual = moviesService.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};
        Assertions.assertArrayEquals(expected, actual);
    }
}
