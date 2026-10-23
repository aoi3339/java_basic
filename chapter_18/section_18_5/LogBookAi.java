package chapter_18.section_18_5;

public class LogBookAi {
    static int total = 0;

    String title;
    int readPages;

    public LogBookAi(String title) {
        this.title = title;
        this.readPages = 0;
        total++;
    }

    public void show() {
        System.out.println(this.title + "：" + this.readPages + "ページまで読んだ");
    }

    public static void showTotal() {
        System.out.println("いま " + total + " 冊");
    }
}
