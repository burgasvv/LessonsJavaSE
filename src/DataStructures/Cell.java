package DataStructures;

public class Cell {
    private int anInt;
    private Cell cell;
    private Cell parent;
    private Cell left;
    private Cell right;

    public Cell(){}
    public Cell(int anInt, Cell parent) {
        this.anInt = anInt;
        this.parent = parent;
    }
    public Cell getCell() {
        return cell;
    }
    public void setCell(Cell cell) {
        this.cell = cell;
    }
    public Cell getParent() {
        return parent;
    }
    public void setParent(Cell parent) {
        this.parent = parent;
    }
    public Cell getLeft() {
        return left;
    }
    public void setLeft(Cell left) {
        this.left = left;
    }
    public Cell getRight() {
        return right;
    }
    public void setRight(Cell right) {
        this.right = right;
    }
    public int getInt() {
        return anInt;
    }
    public void setInt(int anInt) {
        this.anInt = anInt;
    }
}