package chapter_14.section_14_4;

public class BookToolAi {
    // 2つの整数を受け取り、その合計を返すメソッドです。
    public static int add(int first, int second) {
        return first + second;
    }

    // 2つの整数を受け取り、1つ目を2つ目で割った商を返すメソッドです。
    public static int divide(int first, int second) {
        return first / second;
    }

    public static void main(String[] args) {
        // 320と180の合計を求め、totalPagesに入れます。
        int totalPages = add(320, 180);

        // 合計ページ数を30で割り、daysに入れます。
        int days = divide(totalPages, 30);

        // 計算結果を表示します。
        System.out.println("2冊で " + totalPages + " ページ");
        System.out.println("1日30ページなら " + days + " 日");
    }
}
