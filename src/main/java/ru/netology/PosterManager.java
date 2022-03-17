package ru.netology;

public class PosterManager {
    String newFilm = "новый фильм";
    int findLast = 10;
    String[] films = {
            "Бладшот",
            "Вперед",
            "Отель Белград",
            "Джентельмены",
            "Человек-невидимка",
            "Тролли.Мировой тур",
            "Номер один"
    };

    public void addFilm() {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length > findLast) {
            resultLength = findLast;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public String[] findAll() {
        return films;
    }

    public PosterManager(int findLast) {
        this.findLast = findLast;
    }

    public PosterManager() {
    }
}

