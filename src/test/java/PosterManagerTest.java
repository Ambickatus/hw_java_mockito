import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager movies = new PosterManager();

    @Test
    public void findAllMoviesTest() {
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
        String[] expected = {};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllOneMovieTest() {
        movies.add("Movie1");
        String[] expected = {"Movie1"};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveMoviesTest() {
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

        String[] expected = {};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveMoviesSixTest() {
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
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {"Movie6"};
        String[] actual = movies.findLast(1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOneMoviesOneTest() {
        movies.add("Movie4");

        String[] expected = {"Movie4"};
        String[] actual = movies.findLast(1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastZeroMoviesTest() {
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {};
        String[] actual = movies.findLast(0);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesZeroListTest() {
        String[] expected = {};
        String[] actual = movies.findLast(5);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesMoreThanHaveTest() {
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {"Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movies.findLast(12);

        Assertions.assertArrayEquals(expected, actual);
    }
}
