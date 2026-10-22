package chapter_17.section_17_2;

public class RunnerAi {
    public static void main(String[] args) {
        BookNoteAi bookNote = new BookNoteAi();
        bookNote.title = "はじめてのJava";
        bookNote.pages = 320;

        System.out.println(bookNote.title);
        System.out.println(bookNote.pages);
    }
}
