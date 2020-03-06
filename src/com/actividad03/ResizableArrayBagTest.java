package com.actividad03;

class ResizableArrayBagTest {
  public static void main(String[] args) {
    testResizableArrayBag();
  }

  public static void testResizableArrayBag(){
    ResizableArrayBag<String> myBag = new ResizableArrayBag<>(5);
    System.out.println("Empty bag: " + myBag);
    myBag.add("manzana");
    myBag.add("piña");
    myBag.add("naranja");
    myBag.add("manzana");
    myBag.add("sandia");
    myBag.add("pera");
    myBag.add("manzana");
    System.out.println("Bolsa: " + myBag);
    System.out.println("Frecuencia de 'manzana': " + myBag.getFrequencyOf("manzana"));
    System.out.println("Contiene 'pera'? " + myBag.contains("pera"));
    System.out.println("Removiendo elemento: " + myBag.remove());
    System.out.println("Removiendo naranja...");
    myBag.remove("naranja");
    System.out.println("Removiendo toda 'manzana'...");
    myBag.removeEvery("manzana");
    System.out.println("Bolsa: " + myBag);
  }

}