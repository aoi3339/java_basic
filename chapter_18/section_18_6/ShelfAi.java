package chapter_18.section_18_6;

public class ShelfAi {
    LogBookAi book;

    public void keep(LogBookAi book) {
        this.book = book;
    }

    public LogBookAi latest() {
        return this.book;
    }
}
