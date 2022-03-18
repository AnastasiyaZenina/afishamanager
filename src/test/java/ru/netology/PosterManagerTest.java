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
                "Film1",
                "Film2",
                "Film3",
                "Film4",
                "Film5",
                "Film6",
                "Film7",
                "новый фильм",
        };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void moreFilmsThanFindLast() {
        PosterManager manager = new PosterManager(5);
        String[] expected = {
                "Film7",
                "Film6",
                "Film5",
                "Film4",
                "Film3"
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultQuantity() {
        PosterManager manager = new PosterManager();
        String[] expected = {
                "Film7",
                "Film6",
                "Film5",
                "Film4",
                "Film3",
                "Film2",
                "Film1"
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        PosterManager manager = new PosterManager();
        manager.findAll();

        String[] expected = {
                "Film1",
                "Film2",
                "Film3",
                "Film4",
                "Film5",
                "Film6",
                "Film7",
        };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
}
