package com.actividad01.ejercicio04;

public class MovablePoint implements Movable {
  int x;
  int y;
  int xSpeed;
  int ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  @Override
  public void moveUp() {
    y += 1;
  }

  @Override
  public void moveDown() {
    y -= 1;
  }

  @Override
  public void moveLeft() {
    x -=1;
  }

  @Override
  public void moveRight() {
    x += 1;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getxSpeed() {
    return xSpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  @Override
  public String toString() {
    return "MovablePoint{" +
        "x=" + x +
        ", y=" + y +
        ", xSpeed=" + xSpeed +
        ", ySpeed=" + ySpeed +
        '}';
  }
}
