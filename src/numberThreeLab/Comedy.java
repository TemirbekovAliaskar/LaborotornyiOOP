package numberThreeLab;

public class Comedy extends Triller{

    public Comedy(String title, String genre, double rating, int duration) {
        super(title, genre, rating, duration);
    }

    @Override
    public void setFilm(){
        System.out.println("Название фильма : "+ title);
    }
    @Override
    void status() {
        System.out.println("Анонсирован");
    }
    @Override
    void time() {
        System.out.println("2024");
    }

    @Override
    void country() {
        System.out.println("США");
    }
}
