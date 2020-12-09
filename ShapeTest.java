package com.company;

public class ShapeTest {
    public static void main(String[] args) {
        Circle a = new Circle(32);

        Rectangle b = new Rectangle(3,6,"white",true);
        Square c = new Square();
        System.out.println(a.getArea() +" "+ b.getColor());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
