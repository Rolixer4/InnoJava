package ru.inno;

public class Homework1 {
    public static void main(String[] args) {
        String comment = "�������� ����� ��� ��������� �������";
        String comment2 = "@";
        String comment3 = null;
        String comment4 = "�������� ���� ��� ��������� ������� ����� ���������";
        String comment5 = "    ������� �������, ����� ������� �������          ";

        //���������� ����� ������
        int result = comment.length();
        System.out.println(result);

        //���������� True ��� ���������� �������� � ������
        boolean result2 = comment.isEmpty();
        System.out.println(result2);

        //���������� True ��� ���������� �������� � ������, ����� blank-�������� (������, ��������� � �.�)
        boolean result3 = comment.isBlank();
        System.out.println(result3);

        //���������� ������� � ������� �������� substring �� ���������
        String result4 = comment.substring(3, 35);
        System.out.println(result4);

        //���������� ������ ������� ��������� ��������� ���������
        int result5 = comment.indexOf("�����");
        System.out.println(result5);

        //���������� ������ ���������� ��������� ��������� ���������
        int result6 = comment4.lastIndexOf("����");
        System.out.println(result6);

        //���������� ������ � ������ ��������
        String result7 = comment.toLowerCase();
        System.out.println(result7);

        //���������� ������ � ������� ��������
        String result8 = comment.toUpperCase();
        System.out.println(result8);

        //���������� ������ � ���������� ��������� 1 �� �������� 2
        String result9 = comment4.replace("����", "�����");
        System.out.println(result9);

        //���������� true, ���� ������ ���������� � ��������� ��������
        Boolean result10 = comment.startsWith("�����");
        System.out.println(result10);

        //���������� true, ���� ������ ������������� �������� ���������
        Boolean result11 = comment4.endsWith("���������");
        System.out.println(result11);

        //���������� ������ � �������� ����������
        String result12 = comment.repeat(4);
        System.out.println(result12);

        //���������� true ���� ������ �������� �������� ��������
        Boolean result13 = comment2.contains("");
        System.out.println(result13);

        //���������� ������ � ����������� � ����� ���������� ���������
        String result14 = comment.concat("����");
        System.out.println(result14);

        //���������� ������ � ��������� ��������� � ������ � �����
        String result15 = comment5.trim();
        System.out.println(result15);

        //
        Boolean result16 = comment2.equals("@");
        System.out.println(result16);

    }
}
