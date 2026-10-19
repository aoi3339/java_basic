package chapter_11.section_11_1;

public class CountdownAi {
    public static void main(String[] args) {
        int left = 480;
        int perDay = 150;

        while (left > 0) {
            System.out.println("残り " + left + " ページ");
            left = left - perDay;
        }

        System.out.println("読み終わりました");
    }
}
