package Javaclasses;

public class Toy {

String name;
String brand;
double price;
int quantity;



void setPrice (double price){
    this.price = price;

}
public static void main (String[] args){

    Toy toy1 =  new Toy();
    toy1.name = "Labubu";
    toy1.brand = "Mimisu";
    toy1.quantity = 12;
    toy1.price = 5000;
    toy1.setPrice((toy1.price*0.5));
    System.out.println(toy1.setPrice);

}

}
