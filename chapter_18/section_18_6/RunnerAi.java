package chapter_18.section_18_6;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi book = new LogBookAi("はじめてのJava");
        book.addRead(75);

        ShelfAi shelf = new ShelfAi();
        shelf.keep(book);
        shelf.latest().show();

        LogBookAi anotherBook = book;
        anotherBook.addRead(25);
        book.show();
    }
}
