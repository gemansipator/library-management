
import java.util.List;


public class Library {
    List<Book> books; // список всех книг в библиотеке. Это основное поле, содержащее информацию о каждой книге.

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) // — Добавляет книгу в коллекцию библиотеки.
    {

    }

    public void removeBook(Book book) // — Удаляет книгу из библиотеки, если она существует.
    {

    }

    public Object searchByTitle(String title)  // — Возвращает список книг, соответствующих указанному названию.
    {
        return null;
    }

    public Object searchByAuthor(String author) // — Возвращает список книг, написанных указанным автором.
    {
        return null;
    }
    public Object filterByYear(int year) // — Возвращает список книг, изданных в указанном году.
    {
        return null;
    }

    public List<Book> getAvailableBooks()  //  — Возвращает список книг, которые доступны (не взяты).
    {
        return null;
    }

    public void checkoutBook(Book book) // — Изменяет статус книги на "не в наличии" (взята).
    {

    }

    public void returnBook(Book book) // — Изменяет статус книги на "в наличии"
    {

    }


}
