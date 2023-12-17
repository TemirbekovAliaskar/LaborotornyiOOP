package numberThreeLab;

public class Main3 {

    public static void main(String[] args) {

        Triller[] movies = {
                new Triller("Восхождение", "action", 8.1, 106),
                new Triller("Halk", "action", 9.1, 106),
                new Comedy("Дедпул 3", "Комедия", 3.2, 173)
                };

        Film(movies);
        printMovie(movies);
    }



    public static void printMovie(Triller[] movies){
        for(Triller movie: movies){
            System.out.println(movie);
        }
    }
    public static void Film(Triller[] movies){
        for (Triller movie: movies){
            movie.setFilm();
            movie.status();
            movie.time();
            movie.country();
            System.out.println();
        }
    }
}
