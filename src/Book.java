public class Book {
    private String title;       // — Название книги
    private String author;      // — Автор книги
    private int year;           // — Год издания
    private String genre;       // — Жанр книги
    private boolean isAvailable; // — Доступна ли книга (в наличии или на руках)

    public Book(String title, String author, int year, String genre, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
