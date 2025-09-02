import java.util.Scanner;

public class forloop {

    public static void main(String[] args) {
        System.out.println("Enter a valid nummer:");
        Scanner q = new Scanner(System.in);
        int limit = q.nextInt();
        for(int x=1;x<limit;x++){
            
            for(int y=1;y<=x;y++){
                System.out.print(x);
            }
            System.out.println();
        }

        String[] colors = {"yellow","green","orange","white"};
        for(String color:colors)
        System.out.println("Color: "+color);


         int count = 0;
ROW_LOOP: for(int row = 1; row <=3; row++)
 for(int col = 1; col <=2 ; col++) {
 if(row * col % 2 == 0) continue ROW_LOOP;
 count++;
 }
System.out.println(count);

 int m = 9, n = 1, x = 0;
 while(m > n) {
 m--;
 n += 2;
 x += m + n;
 }
System.out.println(x);
        


        for(int i=0; i<10 ; ) {
 i = i++;
 System.out.println("Hello World");
 }
    }
}