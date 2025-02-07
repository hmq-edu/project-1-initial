package com.csc205.project1;

public class Point {

    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // Method to set a point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Methods for shifting a point
    public void shiftX(double shift) {
        this.x += shift;
    }
    public void shiftY(double shift) {
        this.y += shift;
    }

    // Method to calculate the distance between two points
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
    }

    // Method to rotate a point around the origin
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // toString method override
    @Override
    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }
}
