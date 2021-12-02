/*
 *    Rizat.Orazalina created on 02.12.2021
 */

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[][] array = new String[][]
                {{"10", "-2", "3", "7"},
                        {"1", "3", "5", "9"},
                        {"5", "6", "2", "2"},
                        {"3", "7", "8", "1"}
                };

        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"1", "S", "6", "9"},
                {"2", "4"}
        };

        try {
            System.out.println("Choose one of the following cases: 1-Successful case, 2-Unsuccessful case:");
            int selected = scanner.nextInt();
            switch (selected) {
                case 1:
                    System.out.println(arrayException(array));
                    break;
                case 2:
                    System.out.println(arrayException(arr));
                    break;
            }
        } catch (MyArraySizeException error) {
            System.out.println(error.getMessage());
        } catch (MyArrayDataException error) {
            System.out.println(error.getMessage());
        }
    }


    public static int arrayException(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
