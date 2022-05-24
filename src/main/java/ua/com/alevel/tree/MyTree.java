package ua.com.alevel.tree;

public class MyTree {

    MyTree left;
    MyTree right;
    int value;

    public MyTree(MyTree left, MyTree right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public static void main(String[] args) {
        MyTree myTree =
                new MyTree
                        (new MyTree(new MyTree(null,null,12),
                new MyTree(null,null,43), 32),
                                new MyTree(new MyTree(null,null,54),
                                        new MyTree(null,null,23),43), 39);
        System.out.println(myTree);
    }
}
