/*
 *    Rizat.Orazalina created on 02.12.2021
 */

public class MyArrayDataException extends Exception{

    MyArrayDataException(int row, int col) {
        super("Incorrect data is in the cell [" + row + "][" + col + "]");
    }
}
