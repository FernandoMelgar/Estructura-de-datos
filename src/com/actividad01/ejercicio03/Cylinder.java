package com.actividad01.ejercicio03;

public class Cylinder  extends Circle{
  private double height;

  public Cylinder() {
  }

  public Cylinder(double radius) {
    super(radius);
  }

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  public Cylinder(double radius,double height, String color) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume(){
    return getArea()*height;
  }

  @Override
  public double getArea() {
    return (2 * Math.PI * getRadius() * height) + (2 * Math.PI * Math.pow(getRadius(), 2));

  }

  public String getNames(){
    String names  = "";
    String[] authors = {"Leon", "Rodrigo"};
    names = authors[0];
    for (int i = 1 ; i < authors.length; i++) {
      names = ", " + authors[i];

    }
    return names;
  }
}
