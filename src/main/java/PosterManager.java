public class PosterManager {
    private String[] moviesList = new String[0];
    private int howManyMovies;

    public PosterManager(int howManyMovies) {
        this.howManyMovies = howManyMovies;
    }

    public PosterManager() {
        this.howManyMovies = 5;
    }

    public void add(String movie) {
        String[] tmp = new String[moviesList.length + 1];
        for (int i = 0; i < moviesList.length; i++) {
            tmp[i] = moviesList[i];
        }
        tmp[tmp.length - 1] = movie;
        moviesList = tmp;
    }

    public String[] findAll() {
        return moviesList;
    }


    public String[] findLast() {
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
