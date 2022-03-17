package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
    @Test
    public void addFilm() {
        PosterManager manager = new PosterManager();

        String newFilm;
        manager.addFilm();

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
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast1() {
        PosterManager manager = new PosterManager(5);
        manager.findLast();


        String[] expected = {
                "Номер один",
                "Тролли.Мировой тур",
                "Человек-невидимка",
                "Джентельмены",
                "Отель Белград"
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2() {
        PosterManager manager = new PosterManager();
        manager.findLast();


        String[] expected = {
                "Номер один",
                "Тролли.Мировой тур",
                "Человек-невидимка",
                "Джентельмены",
                "Отель Белград",
                "Вперед",
                "Бладшот"
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
