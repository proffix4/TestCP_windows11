package testcp;

import java.util.Scanner;

public class TestCP {

    public static void main(String[] args) {
        // ���������� ����������  ���������
        Scanner sc;
        // ����������� � �������
        if (System.getProperty("os.name", "?").toLowerCase().startsWith("windows")) {
            sc = new Scanner(System.in, "windows-1251");
        } else {
            sc = new Scanner(System.in);
        }
        System.out.print("��� ��� �����: "); // ����� �������
        String n = sc.next(); // ���� � ������� ���������� ��������
        System.out.print("������� ��� ���: "); // ����� �������
        int a = sc.nextInt();// ���� � ������� ������ ��������
        System.out.println("������, " + n + "! ���� ��� " + a + "!");
        sc.close(); // �������� �������
    }

}
