# Управление библиотекой
Создайте программу для управления библиотекой книг. Программа должна позволять добавлять книги, удалять их, 
искать по различным параметрам и выполнять другие операции. Программа должна включать следующие функции:

Класс Book
Переменные:

String title — Название книги
String author — Автор книги
int year — Год издания
String genre — Жанр книги
boolean isAvailable — Доступна ли книга (в наличии или на руках)
Класс Library
Методы:

addBook(Book book) — Добавляет книгу в коллекцию библиотеки.
removeBook(Book book) — Удаляет книгу из библиотеки, если она существует.
searchByTitle(String title) — Возвращает список книг, соответствующих указанному названию.
searchByAuthor(String author) — Возвращает список книг, написанных указанным автором.
filterByYear(int year) — Возвращает список книг, изданных в указанном году.
getAvailableBooks() — Возвращает список книг, которые доступны (не взяты).
checkoutBook(Book book) — Изменяет статус книги на "не в наличии" (взята).
returnBook(Book book) — Изменяет статус книги на "в наличии".
Требования:
Используйте коллекции из Java Collection API для хранения книг в библиотеке.
Реализуйте фильтрацию с использованием Stream API.
В классе Library используйте Map для хранения книг по жанрам.
Создайте методы обработки исключений, чтобы управлять ошибками, например, если пытаются взять книгу, которая уже
не доступна.
Добавьте тестовые сценарии в main() методе, чтобы продемонстрировать работу библиотеки: добавление книг, поиск, 
выдачу и возврат.
Пример выполнения:
Добавьте несколько книг в библиотеку, например, "Мастер и Маргарита" Булгакова, "Преступление и наказание" Достоевского.
Найдите все книги, доступные для выдачи.
Попробуйте взять книгу "Мастер и Маргарита".
Попробуйте снова взять "Мастер и Маргарита" и обработайте исключение.
Верните книгу "Мастер и Маргарита" и снова посмотрите доступные книги.
Это задание позволяет попрактиковаться с Java Collection API, Stream API, обработкой исключений и основами ООП.