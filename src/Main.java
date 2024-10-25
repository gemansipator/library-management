import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Создание списка книг
        List<Book> initialBooks = new ArrayList<Book>();
        initialBooks.add(new Book("1984", "Джордж Оруэл", 1949, "Антиутопия", true));
        initialBooks.add(new Book("Убить пересмешника", "Харпер Ли", 1960, "Художественная литература", true));
        initialBooks.add(new Book("Великий Гэтсби", "Фрэнсис Скотт Фицджеральд", 1925, "Художественная литература", true));
        initialBooks.add(new Book("Моби Дик", "Герман Мелвилл", 1851, "Приключение", true));

        // Создание экземпляра библиотеки
        Library library = new Library(initialBooks);

        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            // Показать меню
            System.out.println("\nВыберите действие:");
            System.out.println("1. Показать доступные книги");
            System.out.println("2. Искать книгу по заголовку");
            System.out.println("3. Проверить книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("0. Выход");
            System.out.print("Введите номер действия: ");

            command = scanner.nextLine();

            switch (command) {
                case "1":
                    // Печать доступных книг
                    System.out.println("\nДоступные книги:");
                    library.getAvailableBooks().forEach(book ->
                            System.out.println(book.getTitle() + " автор: " + book.getAuthor()));
                    break;

                case "2":
                    // Поиск книги по заголовку
                    System.out.print("Введите заголовок книги для поиска: ");
                    String title = scanner.nextLine();
                    List<Book> foundBooks = library.searchByTitle(title);
                    if (foundBooks.isEmpty()) {
                        System.out.println("Книги с таким заголовком не найдены.");
                    } else {
                        foundBooks.forEach(book ->
                                System.out.println(book.getTitle() + " автор: " + book.getAuthor()));
                    }
                    break;

                case "3":
                    // Проверка книги
                    System.out.print("Введите заголовок книги для проверки: ");
                    String checkoutTitle = scanner.nextLine();
                    List<Book> booksToCheckout = library.searchByTitle(checkoutTitle);
                    if (!booksToCheckout.isEmpty()) {
                        Book bookToCheckout = booksToCheckout.get(0); // Проверяем первую найденную книгу
                        library.checkoutBook(bookToCheckout);
                        System.out.println("Взято: " + bookToCheckout.getTitle());
                    } else {
                        System.out.println("Книга не найдена.");
                    }
                    break;

                case "4":
                    // Возврат книги
                    System.out.print("Введите заголовок книги для возврата: ");
                    String returnTitle = scanner.nextLine();
                    List<Book> booksToReturn = library.searchByTitle(returnTitle);
                    if (!booksToReturn.isEmpty()) {
                        Book bookToReturn = booksToReturn.get(0); // Возвращаем первую найденную книгу
                        library.returnBook(bookToReturn);
                        System.out.println("Возвращено: " + bookToReturn.getTitle());
                    } else {
                        System.out.println("Книга не найдена.");
                    }
                    break;

                case "0":
                    System.out.println("Выход из программы...");
                    break;

                default:
                    System.out.println("Неверный ввод. Пожалуйста, попробуйте снова.");
            }
        } while (!command.equals("0")); // Продолжаем, пока не введен 0

        scanner.close(); // Закрываем сканер перед выходом
    }
}