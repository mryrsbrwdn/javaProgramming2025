public class wile {
public static void main(String[] args) {
 int hourofday =11;
 int morning = 0;

 if(hourofday>=18)
    System.out.println("Good evening");

else if(hourofday>=12)
    System.out.println("Good afternoon");

else
    System.out.println("Good morning");


    
System.out.println((hourofday>=18)?"Good eve":(hourofday>=12)?"Good afternoon":"Good morning");

//switch
int dayofweek =  13;
switch (dayofweek){
    
    case 1:System.out.println("Montag"); 
    break;
    case 2: System.out.println("Dienstag"); 
    break;
    case 3:System.out.println("Mittwoch"); 
    break;
    case 4:System.out.println("Donnerstag");
    break;
    case 5:System.out.println("Frietag");
    break;
    case 6:
    case 7:System.out.println("Weekends");
    break;

    default: System.out.println("Invalid day"); 
}
}
}