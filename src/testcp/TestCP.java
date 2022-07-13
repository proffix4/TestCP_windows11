package testcp;

import java.util.Scanner;

public class TestCP {

    public static void main(String[] args) {
        // Простейшая консольная  программа
        Scanner sc;
        // Подключение к консоли
        if (System.getProperty("os.name", "?").toLowerCase().startsWith("windows")) {
            sc = new Scanner(System.in, "windows-1251");
        } else {
            sc = new Scanner(System.in);
        }
        System.out.print("Как вас зовут: "); // Вывод вопроса
        String n = sc.next(); // Ввод с консоли строкового значения
        System.out.print("Сколько вам лет: "); // Вывод вопроса
        int a = sc.nextInt();// Ввод с консоли целого значения
        System.out.println("Привет, " + n + "! Тебе уже " + a + "!");
        sc.close(); // Закрытие консоли
    }

}
