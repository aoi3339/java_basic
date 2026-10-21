package chapter_14.section_14_2;

public class RecorderAi {
    // 引数を受け取らず、見出しを表示するメソッドです。
    public static void showHeading() {
        System.out.println("読書の記録");
        System.out.println("==========");
    }

    // 書名とページ数を受け取り、本の情報を表示するメソッドです。
    public static void showBook(String title, int pages) {
        System.out.println(title + " は " + pages + " ページ");
    }

    public static void main(String[] args) {
        showHeading();
        showBook("旅の記録", 320);
        showBook("星の地図", 180);
    }
}
