package chapter_05.section_5_6;

public class CircleAi {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius = 5.0;

        double area = radius * radius * PI;

        System.out.println("半径: " + radius);
        System.out.println("面積: " + area);

        radius = 10.0;
        area = radius * radius * PI;

        System.out.println("半径を変えた後の面積: " + area);
    }
}
