package com.actividad02;
public class BallGame {

  public static String game(int ballNumber) {
    String gameInfo = "";
    ResizableArrayBag<Integer> bag = new ResizableArrayBag<>();
    bag.add(ballNumber);
    while (bag.getCurrentSize() > 0 )
     gameInfo += play(bag);
    return gameInfo;
  }
  
  private static String play(ResizableArrayBag<Integer> bag){
    String movementInfo = "";
    movementInfo += "Bolsa: " + bag + "\n";
    int ballNumber = takeBall(bag);
    movementInfo += "Retirado: " + ballNumber + "\n";
    if (bag.getCurrentSize() == 0)
      movementInfo += "La bolsa está vacía!";
    return movementInfo;
  }

  private static int takeBall(ResizableArrayBag<Integer> bag){
    int ballNumber = bag.remove();
    if (ballNumber != 0){
      for (int i = 0; i < ballNumber; i++) {
        bag.add(ballNumber / 2);
      }
    }
    return ballNumber;
  }

}
