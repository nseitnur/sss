package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File(""));
        Scanner sc2 = new Scanner(new File(""));
        int x, y;
        Shape shape = new Shape();
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
            Point point = new Point(x ,y);
            shape.addPoint(point);

        }

        shape.allDistance();
        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
        }

        System.out.println(shape.perimetr());
        System.out.println(shape.avarageSize());
        System.out.println(shape.longestSide());
    }
}
