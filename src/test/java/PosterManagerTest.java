import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager movies = new PosterManager();

    @Test
    public void showAllMoviesTest() {
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4"};
        String[] actual = movies.showAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllMoviesZeroTest() {
        String[] expected = {};
        String[] actual = movies.showAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllOneMovieTest() {
        movies.add("Movie1");
        String[] expected = {"Movie1"};
        String[] actual = movies.showAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFiveMoviesTest() {
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");

        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movies.showLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFiveMoviesLessThanFiveTest() {
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");

        String[] expected = {"Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movies.showLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFiveMoviesZeroTest() {

        String[] expected = {};
        String[] actual = movies.showLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFiveMoviesSixTest() {
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {"Movie6", "Movie5", "Movie4", "Movie3", "Movie2"};
        String[] actual = movies.showLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastMoviesOneTest() {
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {"Movie6"};
        String[] actual = movies.showLast(1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastOneMoviesOneTest() {
        movies.add("Movie4");

        String[] expected = {"Movie4"};
        String[] actual = movies.showLast(1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastZeroMoviesTest() {
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {};
        String[] actual = movies.showLast(0);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastMoviesZeroListTest() {
        String[] expected = {};
        String[] actual = movies.showLast(5);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastMoviesMoreThanHaveTest() {
        movies.add("Movie1");
        movies.add("Movie2");
        movies.add("Movie3");
        movies.add("Movie4");
        movies.add("Movie5");
        movies.add("Movie6");

        String[] expected = {"Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movies.showLast(12);

        Assertions.assertArrayEquals(expected, actual);
    }
}
