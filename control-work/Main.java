import java.util.Arrays;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Reader {
    String fullName;
    int libraryCardNumber;
    String faculty;
    String birthDate;
    String phoneNumber;

    public Reader(String fullName, int libraryCardNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.title + " (автор: " + book.author + "), ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.title + " (автор: " + book.author + "), ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 12345, "Факультет информатики", "01.01.1990", "+7 (123) 456-7890");

        Book book1 = new Book("Приключения", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(3);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader1.returnBook(book1, book2, book3);
    }
}
