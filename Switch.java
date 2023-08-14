
import java.util.Scanner;
public class Switch {
           public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
                 System.out.println("Enter the key");
                 int num= input.nextInt();
                 switch (num){
                    case 1:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter the number");
                    int number= in.nextInt();
                    if(number%2==0){
                              System.out.println("IT IS A ODD NUMBER");

                    }else{
                              System.out.println("IT IS A EVEN NUMBER");
                    }
           break;
                  default :
                  Scanner inti = new Scanner(System.in);
                    System.out.println("Enter the number");
                    int number1= inti.nextInt();
                    if(number1%2==0){
                              System.out.println("IT IS A ODD NUMBER");

                    }else{
                              System.out.println("IT IS A EVEN NUMBER");
                    }

                 }   
          }
         
}
