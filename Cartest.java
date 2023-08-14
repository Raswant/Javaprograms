import java.util.Scanner;
public class Cartest{
          public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("WLECOM TO TIRE TEST");
                    System.out.println("ENTER YOUR TIRE CONDUCTION");
                    int mytire=input.nextInt();
                    if(mytire==100){
                              System.out.println("YOUR TIRE IS GOOD CONDUCTION");
                              System.out.println("YOU CAN GO BACK TO HOME");
                    }
                    else if(mytire>10 && mytire<50){
                              System.out.println("YOUR FILL WITH AIR NEED ");
                    }
                    else{
                              System.out.println("YOUR TIRE NEED TO BE REPLACE");
                    }

          }

}