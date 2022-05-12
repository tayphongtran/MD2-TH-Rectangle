package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("nhap width: ");
           double width = scanner.nextDouble();
           System.out.println("nhap height: ");
           double height = scanner.nextDouble();

           Rectangle rectangle = new Rectangle(width,height);

           rectangle.getPerimeter();
           rectangle.getArea();
           System.out.println("quit de thoat hoac nhap tiep");
           if (scanner.nextLine()=="quit"){
               break;
           }
       }
    }
}
