public class PosterManager {
    private String[] moviesList = new String[0];

    public void add(String movie) {
        String[] tmp = new String[moviesList.length + 1];
        for (int i = 0; i < moviesList.length; i++) {
            tmp[i] = moviesList[i];
        }
        tmp[tmp.length - 1] = movie;
        moviesList = tmp;
    }

    public String[] showAll() {
        return moviesList;
    }

    public String[] showLast() {
        int counter = 0;
        if (moviesList.length < 5) {
            counter = moviesList.length;
        } else {
            counter = 5;
        }
        String[] tmp = new String[counter];
        for (int i = 0; i < counter; i++) {
            tmp[i] = moviesList[moviesList.length - 1 - i];
        }
        return tmp;
    }

    public String[] showLast(int howManyMovies) {
        int counter = 0;
        if (moviesList.length < howManyMovies) {
            counter = moviesList.length;
        } else {
            counter = howManyMovies;
        }
        String[] tmp = new String[counter];
        for (int i = 0; i < counter; i++) {
            tmp[i] = moviesList[moviesList.length - 1 - i];
        }
        return tmp;
    }
}
