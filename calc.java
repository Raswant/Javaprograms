import java.util.Scanner;
public class calc {
          public static void main(String[] args) {
                    Scanner input= new Scanner(System.in);
                    System.out.println("CASE 1=ADDING,CASE 2=SUBRACTION,CASE 3=MULTIPLICATION,CASE 4=MODULES,CASE 5=DIVISION");
                    System.out.println("ENTER THE KEY");
                    int num= input.nextInt();
                    switch(num){
                              case 1:
                              Scanner input1= new Scanner(System.in);
                    System.out.println("ADDACTION");
                    System.out.println("ENTER THE TWO NUMBERS");
                    int num1= input1.nextInt();
                    int num2= input1.nextInt();
                    int total=num1+num2;
                    System.out.println("SUM OF THE TWO NUMBERS IS:"+" "+total);
                    break;
                    case 2:
                              Scanner input3= new Scanner(System.in);
                    System.out.println("SUBRACTION");
                    System.out.println("ENTER THE TWO NUMBERS");
                    int num11= input3.nextInt();
                    int num22= input3.nextInt();
                    int total1=num11-num22;
                    System.out.println("SUB OF THE TWO NUMBERS IS:"+" "+total1);
                    break;
                    case 3:
                              Scanner input4= new Scanner(System.in);
                    System.out.println("MULTIPLACTION");
                    System.out.println("ENTER THE TWO NUMBERS");
                    int num111= input4.nextInt();
                    int num222= input4.nextInt();
                    int total11=num111*num222;
                    System.out.println("MUL OF THE TWO NUMBERS IS:"+" "+total11);
                    break;
                    case 4:
                              Scanner input5= new Scanner(System.in);
                    System.out.println("MODULES");
                    System.out.println("ENTER THE TWO NUMBERS");
                    int num1111= input5.nextInt();
                    int num2222= input5.nextInt();
                    int total111=num1111%num2222;
                    System.out.println("MOD OF THE TWO NUMBERS IS:"+" "+total111);
                    break;
                    case 5:
                              Scanner input6= new Scanner(System.in);
                    System.out.println("DIVISION");
                    System.out.println("ENTER THE TWO NUMBERS");
                    float num11111= input6.nextInt();
                    float num22222= input6.nextInt();
                    float total11111=num11111/num22222;
                    System.out.println("DIV OF THE TWO NUMBERS IS:"+" "+total11111);
                    break;
                    default:
                    System.out.println("PLEASE ENTER A VALID KEY");      
                    }
          }
          
}
