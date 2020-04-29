package com.company;

public class Main {

    public static void main(String[] args) {

        Vector a = new Vector();
        a.setDimension(3);
        a.setElem(0, 5);
        a.setElem(1, 10);
        a.setElem(2, 8);
        a.print();

        Vector b = new Vector();
        b.setDimension(3);
        b.setElem(0, -2);
        b.setElem(1, 6);
        b.setElem(2, 7);
        b.print();

        System.out.println("\nAdd:");
        Vector abAdd = a.add(b);
        abAdd.print();

        System.out.println("Deduct:");
        Vector abDeduct = a.deduct(b);
        abDeduct.print();

        System.out.println("Multiply:");
        Vector abMult = a.multiply(b);
        abMult.print();

        System.out.println("Divide:");
        Vector abDivide = a.divide(b);
        abDivide.print();
    }
}
