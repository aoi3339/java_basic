package chapter_18.section_18_5;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi.showTotal();

        LogBookAi javaBook = new LogBookAi("はじめてのJava");
        LogBookAi sqlBook = new LogBookAi("やさしいSQL");

        LogBookAi.showTotal();
        javaBook.show();
        sqlBook.show();
    }
}
