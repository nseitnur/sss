package com.company;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> points = new ArrayList<>();
    ArrayList<Double> pointDistance = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
    }

//    public ArrayList<Point> getPoints() {
//        return points;
//    }
//
//    public Point getPoint(int index) {
//        return points.get(index);
//    }

    public void allDistance() {
        double sum = 0;
        int size = points.size();
        for (int i = 0; i < size - 1; i++) {
            if (i == size)
                pointDistance.add(size - 1, points.get(points.size()).distance(points.get(0)));

            else
                pointDistance.add(i, points.get(i).distance(points.get(i + 1)));
        }
    }

    public double perimetr() {
        double mas = 0;
        for (int i = 0; i < pointDistance.size(); i++) {
            mas += pointDistance.get(i);
        }
        return mas;
    }

    public double avarageSize() {
        double avg = 0;
        return perimetr()/ points.size();

    }

    public double longestSide() {
        double longSide = 0;
        double max = 0;
        for (int i = 0; i < points.size()-1; i++) {
            if(max < pointDistance.get(i)) {
                max=pointDistance.get(i);
            }

        }
        return max;

    }
}
