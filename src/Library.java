import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books; // Список всех книг в библиотеке. Это основное поле, содержащее информацию о каждой книге.

    public Library(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public void addBook(Book book) { // Добавляет книгу в коллекцию библиотеки.
        // Проверка на null, чтобы предотвратить добавление некорректного объекта
        if (book != null) {
            books.add(book);
        }
    }

    public void removeBook(Book book) { // Удаляет книгу из библиотеки, если она существует.
        // Проверка на null перед удалением
        if (book != null && books.contains(book)) {
            books.remove(book);
        }
    }

    public List<Book> searchByTitle(String title) { // Возвращает список книг, соответствующих указанному названию.
        if (title == null || title.isEmpty()) {
            return new ArrayList<>(); // Возвращаем пустой список
        }
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    public List<Book> searchByAuthor(String author) { // Возвращает список книг, написанных указанным автором.
        if (author == null || author.isEmpty()) {
            return new ArrayList<>(); // Возвращаем пустой список
        }
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .toList();
    }

    public List<Book> filterByYear(int year) { // Возвращает список книг, изданных в указанном году.
        // Проверка на допустимость года
        if (year < 0 || year > 2024) { // Допустимые диапазоны годов
            return new ArrayList<>(); // Возвращаем пустой список для недопустимого года
        }
        return books.stream()
                .filter(book -> book.getYear() == year)
                .toList();
    }

    public List<Book> getAvailableBooks() { // Возвращает список книг, которые доступны (не взяты).
        return books.stream() // Используем поток для работы с коллекцией books
                .filter(Book::isAvailable) // Фильтруем только доступные книги
                .toList(); // Преобразуем отфильтрованные книги обратно в список
    }

    public void checkoutBook(Book book) { // Изменяет статус книги на "не в наличии" (взята).
        // Проверка на null перед изменением статуса книги
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
        }
    }

    public void returnBook(Book book) { // Изменяет статус книги на "в наличии".
        // Проверка на null перед изменением статуса книги
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
        }
    }
}
