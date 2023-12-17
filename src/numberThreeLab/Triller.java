package numberThreeLab;

import java.time.LocalDate;

public class Triller extends Movie {
    public String title;
    public String genre;
    public double rating;
    public int duration;

    public Triller(String title, String genre, double rating, int duration) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
    }

    @Override
    public void setFilm(){
        System.out.println("Название фильма : "+ title);
    }

    @Override
    void status() {
        System.out.println("Вышел на прокат !");
    }

    @Override
    void time() {
        System.out.println(LocalDate.of(2020,5,7));
    }

    @Override
    void country() {
        System.out.println(" Kyrgyzstan ");
    }

    @Override
    public String toString() {
        return "Фильмы{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                '}';
    }
}
