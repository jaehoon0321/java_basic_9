package javabasic_02.day07;

public class MovieTest {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.movieTitle = "아바타";
        movie1.movieStartDay = "2022.12.14";
        movie1.actor = "제이크 설러";
        movie1.genre = "액션";
        movie1.runningTime = "192";
        movie1.movielevel = "12세";

        Movie movie2 = new Movie();
        movie2.movieTitle = "어벤져스";

        Movie movie3 = new Movie();
        movie3.movieTitle = "아이언맨";

        Movie[] movieList = new Movie[3];
        movieList[0] = movie1;
        movieList[1] = movie2;
        movieList[2] = movie3;

        System.out.println("----------각 배열의 인덱스를 참조 출력----------");
        System.out.println("01 영화제목: " + movieList[0].movieTitle);
        System.out.println("02 영화제목: " + movieList[1].movieTitle);
        System.out.println("03 영화제목: " + movieList[2].movieTitle);

        System.out.println("----------iter 참조 출력---------------------");
        int i = 0;
        for (Movie movie : movieList) {
            System.out.println((i++) + "번째 영화 제목: " + movie.movieTitle);
        }

        System.out.println("----------itar 참조 출력---------------------");
        for (int j = 0; j < movieList.length; j++) {
            Movie movie = movieList[j];
            System.out.println(movie.movieTitle);
        }
    }
}
