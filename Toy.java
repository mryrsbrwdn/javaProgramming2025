package Javaclasses;

public class  {

String name;
String brand;
double price;
int quantity;



void setPrice (double price){
    this.price = price;

}
public static void main (String[] args){

    Main toy =  new Main();
    toy.name = "Labubu";
    toy.brand = "Mimisu";
    toy.quantity = 12;
    toy.price = 5000;
    toy.setPrice((toy.price*0.5));
    System.out.println(toy.setPrice);

}

}
