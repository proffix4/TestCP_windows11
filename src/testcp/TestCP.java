package testcp;

import java.util.Scanner;

public class TestCP {

    public static void main(String[] args) {
        // ���������� ����������  ���������
        //System.setProperty("console.encoding", "UTF-8");
        //System.setOut(new PrintStream(System.out, true, "utf-8"));
        //Scanner sc = new Scanner(System.in, "utf-8"); // ����������� � �������
        Scanner sc = new Scanner(System.in); // ����������� � �������
        System.out.print("��� ��� �����: "); // ����� �������
        String n = sc.next(); // ���� � ������� ���������� ��������
        System.out.print("������� ��� ���: "); // ����� �������
        int a = sc.nextInt();// ���� � ������� ������ ��������
        System.out.print("��� ���: "); // ����� �������
        float w = sc.nextFloat();// ���� � ������� ������������� ��������
        System.out.println("������, " + n + "! ���� " + a + " ����, ��� "
                + w + " ��.");
        sc.close(); // �������� �������
    }

}
