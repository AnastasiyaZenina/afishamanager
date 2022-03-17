package ru.netology;

public class PosterManager {
    private int findLast = 10;

    public int getFindLast() {
        return findLast;
    }

    public PosterManager() {
    }

    public PosterManager(int findLast) {
        this.findLast = findLast;
    }

    public String[] addNewFilm(String newFilm) {
        String[] Films = {
                "Бладшот",
                "Вперед",
                "Отель Белград",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли.Мировой тур",
                "Номер один"

        };
        String[] tmp = new String[Films.length + 1];
        System.arraycopy(Films, 0, tmp, 0, Films.length);
        tmp[tmp.length - 1] = newFilm;
        Films = tmp;
        return Films;
    }

    public String[] findAll() {
        String[] Films = {
                "Бладшот",
                "Вперед",
                "Отель Белград",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли.Мировой тур",
                "Номер один"
        };
        return Films;
    }

    public String[] findLast(int findLast) {
        String[] Films = {
                "Бладшот",
                "Вперед",
                "Отель Белград",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли.Мировой тур",
                "Номер один"
        };
        int resultLength;
        if (Films.length > findLast) {
            resultLength = findLast;
        } else {
            resultLength = Films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = Films.length - i - 1;
            result[i] = Films[index];
        }
        return result;
    }
}

