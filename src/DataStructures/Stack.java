package DataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack {
    private int size;
    private Cell cell;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size += size;
    }
    public void push(int anInt){
        Cell temp = new Cell();
        temp.setInt(anInt);
        temp.setCell(cell);
        cell = temp;
    }
    public int pop(){
        if (cell != null){
            int number = cell.getInt();
            cell = cell.getCell();
            return number;
        }
        return 0;
    }
    public String toString(){
        int[]arr = new int[getSize()];
        for (int i = 0; i < getSize(); i++)
            Array.setInt(arr,i,pop());
        return Arrays.toString(arr);
    }
}