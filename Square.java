package com.company;

class Square extends Rectangle {
    protected double side;

    Square() {
    }
    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }
    public  void setLength(double side) {
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }

    public String toString(){
        return "Квадрат готов!";
    }
}
