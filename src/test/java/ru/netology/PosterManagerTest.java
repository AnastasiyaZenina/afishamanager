package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
    @Test
    public void shouldPosterManager() {
        PosterManager manager = new PosterManager(11);

        int expected = 11;
        int actual = manager.getFindLast();

        assertEquals(expected, actual);
    }

    @Test
    public void addNewFilm() {
        PosterManager manager = new PosterManager();
        manager.addNewFilm("новый фильм");

        String[] expected = {
                "Бладшот",
                "Вперед",
                "Отель Белград",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли.Мировой тур",
                "Номер один",
                "новый фильм",
        };
        String[] actual = manager.addNewFilm("новый фильм");

        assertArrayEquals(expected, actual);
    }


    @Test
    public void moreFilmsThanFindLast() {
        PosterManager manager = new PosterManager();
        String[] expected = {
                "Номер один",
                "Тролли.Мировой тур",
                "Человек-невидимка",
                "Джентельмены",
                "Отель Белград"
        };
        String[] actual = manager.findLast(5);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultQuantity() {
        PosterManager manager = new PosterManager();
        String[] expected = {
                "Номер один",
                "Тролли.Мировой тур",
                "Человек-невидимка",
                "Джентельмены",
                "Отель Белград",
                "Вперед",
                "Бладшот"
        };
        String[] actual = manager.findLast(10);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        PosterManager manager = new PosterManager();
        manager.findAll();

        String[] expected = {
                "Бладшот",
                "Вперед",
                "Отель Белград",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли.Мировой тур",
                "Номер один"
        };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
}
