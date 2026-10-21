package chapter_15.section_15_2;

public class ViewerAi {
    public static void main(String[] args) {
        // BookMathAiクラスのaddPagesメソッドを呼び出します。
        int total = BookMathAi.addPages(320, 180);

        // 計算結果を表示します。
        System.out.println("2冊で " + total + " ページ");
    }
}
