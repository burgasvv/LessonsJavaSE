package DataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Queue {
    private int size;
    private Cell first;
    private Cell last;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void push(int number){
        if (first == null){
            first = new Cell();
            first.setInt(number);
            last = first;
        }
        else {
            Cell temp = new Cell();
            temp.setInt(number);
            last.setCell(temp);
            last = temp;
        }
    }
    public int pop(){
        int number = first.getInt();
        push(number);
        first = first.getCell();
        return number;
    }
    public String toString(){
        int[]arr = new int[getSize()];
        for (int i = 0; i < getSize(); i++)
            Array.setInt(arr,i,pop());
        return Arrays.toString(arr);
    }
}