package testcp;

import java.util.Scanner;

public class TestCP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Подключение к консоли
        System.out.print("Как вас зовут: "); // Вывод вопроса
        String n = sc.next(); // Ввод с консоли строкового значения
        System.out.print("Сколько вам лет: "); // Вывод вопроса
        int a = sc.nextInt();// Ввод с консоли целого значения
        System.out.println("Привет, " + n + "! Тебе уже " + a + "!");
        sc.close(); // Закрытие консоли
    }

}
