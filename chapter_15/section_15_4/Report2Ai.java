package chapter_15.section_15_4;

import chapter_15.section_15_2.BookMathAi;

public class Report2Ai {
    public static void main(String[] args) {
        // 320ページと180ページの合計を求めます。
        int total = BookMathAi.addPages(320, 180);

        // 合計ページ数を1日分の30ページで割り、日数を求めます。
        int days = BookMathAi.dividePages(total, 30);

        // 計算結果を表示します。
        System.out.println("2冊で " + total + " ページ");
        System.out.println("1日30ページなら " + days + " 日");
    }
}
