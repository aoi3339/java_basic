package chapter_10.section_10_3;

public class GenreAi {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("ジャンル番号を入力してください（1から4）: ");
        int genreNumber = scanner.nextInt();

        String shelfName = switch (genreNumber) {
            case 1 -> "小説";
            case 2 -> "技術書";
            case 3, 4 -> "図鑑と写真集";
            default -> "その他";
        };

        System.out.println("棚の名前は " + shelfName + " です");
    }
}
