package com.actividad01.ejercicio02;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    public Book(String name, Author[] author, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;     
    }
    
    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
        return authors;
    }
    
//    public String getAuthorName(){
//        return author.getName();
//    }
//    
//    public String getAuthorEmail(){
//        return author.getEmail();        
//    }
//    
//    public char getAuthorGender(){
//        return author.getGender();
//    }


    public String getAuthorNames(){
        String names = "";
        names = authors[0].getName();
        
        for (int i = 1; i < authors.length; i++) {
            names += ", " + authors[i].getName();            
        }
                       
        return names;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String toString(){
        return "Book[name = " + name + ", authors = {" + getAuthorNames() + "}, price = " + price + ", qty = " + qty;
    } 
    
}
