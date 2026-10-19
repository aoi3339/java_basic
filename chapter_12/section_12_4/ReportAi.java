package chapter_12.section_12_4;

public class ReportAi {
    public static void main(String[] args) {
        int[] pageCounts = {320, 180, 480, 96, 240};
        int allPages = 0;
        int thickCount = 0;

        for (int i = 0; i < pageCounts.length; i++) {
            allPages = allPages + pageCounts[i];

            if (pageCounts[i] >= 300) {
                thickCount++;
            }
        }

        System.out.println("合計 " + allPages + " ページ");
        System.out.println("300ページ以上は " + thickCount + " 冊");
    }
}
