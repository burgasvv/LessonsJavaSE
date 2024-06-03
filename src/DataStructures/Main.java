package DataStructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static final ArrayList<Cell>visitors = new ArrayList<>();
    private static final ArrayList<Cell>queue = new ArrayList<>();
    public static void bypassInDepth(Cell tree){
        visitors.add(tree);
        System.out.print(tree.getInt() + "\t");
        if (tree.getLeft() != null && !visitors.contains(tree.getLeft()))
            bypassInDepth(tree.getLeft());
        if (tree.getRight() != null && !visitors.contains(tree.getRight()))
            bypassInDepth(tree.getRight());
        if (tree.getParent() != null)
            bypassInDepth(tree.getParent());
    }
    public static void bypassInBreadth(Cell tree){
        System.out.print(tree.getInt() + "\t");
        if (tree.getRight() != null)
            queue.add(tree.getRight());
        if (tree.getLeft() != null)
            queue.add(tree.getLeft());
        if (!queue.isEmpty()){
            Cell temp = queue.get(0);
            queue.remove(0);
            bypassInBreadth(temp);
        }
    }

    public static void main(String[]argc) {
        Cell tree = new Cell();
        tree.setInt(10);

        tree.setLeft(new Cell());
        tree.getLeft().setInt(11);
        tree.getLeft().setParent(tree);

        tree.setRight(new Cell());
        tree.getRight().setInt(12);
        tree.getRight().setParent(tree);

        tree.getLeft().setLeft(new Cell());
        tree.getLeft().getLeft().setInt(13);
        tree.getLeft().getLeft().setParent(tree.getLeft());

        tree.getLeft().setRight(new Cell());
        tree.getLeft().getRight().setInt(14);
        tree.getLeft().getRight().setParent(tree.getLeft());

        tree.getRight().setLeft(new Cell());
        tree.getRight().getLeft().setInt(15);
        tree.getRight().getLeft().setParent(tree.getRight());

        tree.getRight().setRight(new Cell());
        tree.getRight().getRight().setInt(16);
        tree.getRight().getRight().setParent(tree.getParent());

        bypassInDepth(tree);

        List<Struct>structList = new ArrayList<>();
        structList.add(new Struct(10,"Reeves Carol"));
        structList.add(new Struct(15,"Marvin"));
        structList.add(new Struct(7,"Reeves Roth"));
        structList.add(new Struct(3,"Chris"));
        structList.add(new Struct(22,"Reeves Ash"));
        System.out.println("\n" + structList);
        structList.sort(new Comparator<Struct>() {
            @Override
            public int compare(Struct o1, Struct o2) {
                int c = 0;
                while (o1.getString().charAt(c) == o2.getString().charAt(c) &&
                        c < o1.getString().length() && c < o2.getString().length()-1)c++;
                return o1.getString().compareTo(o2.getString());
            }
        });
        System.out.println(structList);
        String string = "Hello World, let's talk about food.";
        String[]strings = string.split("\\s+",-1);
        System.out.println(strings.length);

        Cell tree1 = new Cell(5, null);

        tree1.setRight(new Cell(10,tree1));
        tree1.getRight().setRight(new Cell(15,tree1.getRight()));
        tree1.getRight().setLeft(new Cell(20,tree1.getRight()));

        tree1.setLeft(new Cell(25,tree1));
        tree1.getLeft().setRight(new Cell(30,tree1.getLeft()));
        tree1.getLeft().setLeft(new Cell(35,tree1.getLeft()));

        bypassInBreadth(tree1);
    }
}