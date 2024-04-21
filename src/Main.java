import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String row1 = scanner.next();
        String row2 = scanner.next();
        String row3 = scanner.next();

        System.out.println("Задача1");
        System.out.println("Длинная строка");
        String rowMax1 = row1.length() > row2.length() ? row1 : row2;
        String rowMax2 = rowMax1.length() > row3.length() ? rowMax1 : row3;
        System.out.println(rowMax2 + ": длина строки - " + rowMax2.length());
        System.out.println("Короткая строка");
        String rowMin1 = row1.length() < row2.length() ? row1 : row2;
        String rowMin2 = rowMin1.length() < row3.length() ? rowMin1 : row3;
        System.out.println(rowMin2 + ":  длина строки - " + rowMin2.length());
        System.out.println();
        System.out.println("Задача2");
        if (row1.length() >= row2.length() && row1.length() >= row2.length()) {
            if (row2.length() >= row3.length()) {
                System.out.println(row3 + " " + row2 + " " + row1);
            } else {
                System.out.println(row2 + " " + row3 + " " + row1);
            }
        } else if (row2.length() >= row1.length() && row2.length() >= row3.length()) {
            if (row1.length() >= row3.length()) {
                System.out.println(row3 + " " + row1 + " " + row2);
            } else {
                System.out.println(row1 + " " + row3 + " " + row2);
            }
        } else {
            if (row1.length() >= row2.length()) {
                System.out.println(row2 + " " + row1 + " " + row3);
            } else {
                System.out.println(row1 + " " + row2 + " " + row3);
            }
        }
        System.out.println();
        System.out.println("Задача3");
        String[] str = {row1, row2, row3};
        float average = 0f;
        //Считаем общую сумму длин строк
        for (String item : str) {
            average += (float) item.length();
        }
        average /= str.length;
        System.out.println("Средняя длина строки = (" + average + ")");
        for (int i = 0; i < 3; i++) {
            if (str[i].length() < average) {
                System.out.println("Строка меньшая чем средняя длина: ");
                System.out.println(str[i] + " длина = " + str[i].length());
            }
        }

//        System.out.println();
//        System.out.println("Задача4");
//        String[] str1 = {row1, row2, row3};

        System.out.println();
        System.out.println("Задача5");
        int sizeOfInput = row1.length();
        for (int i = 0; i < sizeOfInput; i++) {
            int endIndex = i + 1;
            String RowDou = row1.substring(i, endIndex);
            System.out.print(RowDou + RowDou);
        }
    }
}