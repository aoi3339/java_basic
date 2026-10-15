package chapter_09.section_9_4;

public class BranchAi {
    public static void main(String[] args) {
        boolean borrowed = true;
        boolean requested = true;

        if (borrowed) {
            if (requested) {
                System.out.println("貸出中で、次の予約が入っています");
            } else {
                System.out.println("貸出中です。いま予約できます");
            }
        } else {
            System.out.println("棚にあります");
        }
    }
}