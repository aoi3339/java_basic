package chapter_10.section_10_1;

public class RankAi {
    public static void main(String[] args) {
        int pages = 320;
        String label;

        if (pages < 150) {
            label = "短編";
        } else if (pages < 300) {
            label = "標準";
        } else if (pages < 500) {
            label = "読みごたえあり";
        } else {
            label = "大作";
        }

        System.out.println(pages + " ページは " + label + " です");
    }
}
