package chapter_17.section_17_4;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi firstBook = new LogBookAi();
        firstBook.title = "はじめてのJava";
        firstBook.addRead(75);

        LogBookAi secondBook = new LogBookAi();
        secondBook.title = "やさしいSQL";
        secondBook.addRead(20);

        firstBook.show();
        secondBook.show();
    }
}
