package chapter_17.section_17_3;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi logBook = new LogBookAi();
        logBook.title = "はじめてのJava";
        logBook.addRead(30);
        logBook.addRead(45);
        logBook.show();
    }
}
