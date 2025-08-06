package javabasic_02.day11.class01;

public class Movie {
    public void setPlay(String play) {
        this.play = play;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setTitle(String title) {
        Title = title;
    }

    private String Title;
    private String Genre;
    private String play;

    public void play() {
        System.out.println(Title + "(" + Genre + ") 상영중입니다.");
    }



}
