package com.company;

class Circle extends Shape {
    protected double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double getArea() {
        return radius * radius*Math.PI;
    }

    public double getPerimeter() { return 2*Math.PI* radius; }

    public String toString(){
        return "Круг готов!";
    }
}
