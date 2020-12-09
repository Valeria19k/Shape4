package com.company;

class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getLength() {
        return length;
    }

    public  void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() { return (length * width) / 2;
    }
    public double getPerimeter(){ return 2*Math.sqrt((length*length)-(width*width))+2*length;}

    public String toString(){
        return "Прямоугольник готов!";
    }
}
