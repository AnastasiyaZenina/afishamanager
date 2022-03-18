package ru.netology;

public class PosterManager {
    private int findLast = 10;
    private String[] Films = {"Film1", "Film2", "Film3",
            "Film4", "Film5", "Film6", "Film7"
    };

    public PosterManager() {
    }

    public PosterManager(int findLast) {
        this.findLast = findLast;
    }

    public int getFindLast() {
        return findLast;
    }

    public void addNewFilm(String newFilm) {
        String[] tmp = new String[Films.length + 1];
        System.arraycopy(Films, 0, tmp, 0, Films.length);
        tmp[tmp.length - 1] = newFilm;
        Films = tmp;
    }

    public String[] findAll() {
        return Films;
    }

    public String[] findLast() {
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

