import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void findAllMoviesTest() {
        PosterManager movies = new PosterManager();
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4"};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllMoviesZeroTest() {
        PosterManager movies = new PosterManager();
        String[] expected = {};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllOneMovieTest() {
        PosterManager movies = new PosterManager();
        movies.add("Movie1");
        String[] expected = {"Movie1"};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveMoviesTest() {
        PosterManager movies = new PosterManager();
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");

        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveMoviesLessThanFiveTest() {
        PosterManager movies = new PosterManager();
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");

        String[] expected = {"Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveMoviesZeroTest() {
        PosterManager movies = new PosterManager();

        String[] expected = {};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveMoviesSixTest() {
        PosterManager movies = new PosterManager();
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {"Movie6", "Movie5", "Movie4", "Movie3", "Movie2"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesOneTest() {
        PosterManager movies = new PosterManager(1);
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {"Movie6"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOneMoviesOneTest() {
        PosterManager movies = new PosterManager(1);
        movies.add("Movie4");

        String[] expected = {"Movie4"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastZeroMoviesTest() {
        PosterManager movies = new PosterManager(0);
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesZeroListTest() {
        PosterManager movies = new PosterManager(5);
        String[] expected = {};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesMoreThanHaveTest() {
        PosterManager movies = new PosterManager(12);
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {"Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
