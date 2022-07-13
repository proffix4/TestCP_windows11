package testcp;

import java.util.Scanner;

public class TestCP {

    public static void main(String[] args) {
        // Простейшая консольная  программа
        //System.setProperty("console.encoding", "UTF-8");
        //System.setOut(new PrintStream(System.out, true, "utf-8"));
        //Scanner sc = new Scanner(System.in, "utf-8"); // Подключение к консоли
        Scanner sc = new Scanner(System.in); // Подключение к консоли
        System.out.print("Как вас зовут: "); // Вывод вопроса
        String n = sc.next(); // Ввод с консоли строкового значения
        System.out.print("Сколько вам лет: "); // Вывод вопроса
        int a = sc.nextInt();// Ввод с консоли целого значения
        System.out.print("Ваш вес: "); // Вывод вопроса
        float w = sc.nextFloat();// Ввод с консоли вещественного значения
        System.out.println("Привет, " + n + "! Тебе " + a + " года, вес "
                + w + " кг.");
        sc.close(); // Закрытие консоли
    }

}
