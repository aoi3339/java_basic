// Itemsという名前のクラス（プログラムをまとめる入れ物）を作ります。
public class Items {
    // mainメソッド（プログラムが最初に動き始める場所）を作ります。
    public static void main(String[] args) {
        // todosという配列（複数のデータを順番に入れる箱）に、3件のTodoを入れます。
        String[] todos = { "牛乳を買う", "", "パンを買う", "掃除をする" };

        // iを0から1ずつ増やし、todosの件数より小さい間、処理を繰り返します。
        for (int i = 0; i < todos.length; i++) {
            // i番目のTodoが空文字でない場合だけ、<li>で囲んで表示します。
            if (!todos[i].isEmpty()) {
                System.out.println("<li>" + todos[i] + "</li>");
            }
            // for文（処理を繰り返す書き方）の範囲を閉じます。
        }
        // mainメソッドの範囲を閉じます。
    }
    // Itemsクラスの範囲を閉じます。
}
