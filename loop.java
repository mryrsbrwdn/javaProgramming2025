public class loop {
   public static void main (String [] args){
    byte zahlen= 1;
    
    while (zahlen<=10) 
        System.out.println("Nummer "+ zahlen++);
        System.out.println("Endes des Program");
        
    
      byte a =1;
        while (a<=10)
         System.out.println("a = "+ a++);
        
         do
         System.out.println("do while a=" + a--);

         while (a<10) ;
            
         System.out.println("Ende des Programm");

         byte [] evennum = {2,4,6,8,10};
         byte p=0;

         do
         System.out.println("Even number"+ evennum[p++]);
         while (p<evennum.length);
   }
}
