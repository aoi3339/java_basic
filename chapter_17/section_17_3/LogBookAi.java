package chapter_17.section_17_3;

public class LogBookAi {
    String title;
    int readPages;

    void addRead(int pages) {
        this.readPages += pages;
    }

    void show() {
        System.out.println(this.title + "：" + this.readPages + "ページまで読んだ");
    }
}
