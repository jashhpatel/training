package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome! Lets calculate area of triangle");
        System.out.println("Enter the Length of base");
        int base = ip.nextInt();
        System.out.println("Enter the length of altitude/height");
        int height = ip.nextInt();
        int area = (int) (0.5*base*height);
        System.out.println("The area of triangle is "+ area);
        System.out.println("Hi i am inside the development branch");
    }
}