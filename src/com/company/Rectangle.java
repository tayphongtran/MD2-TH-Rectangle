package com.company;

public class Rectangle {
    double width, height;
    double area, perimeter;
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  void getArea(){
        System.out.println("dien tich: " + height*width );
    }
    public void  getPerimeter(){
        System.out.println("chu vi : " + (width + height)*2);
    }

    public String display(){
        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }
}
