import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//scanner created
        //creating x value
        System.out.println("Enter x value:");
        int x=input.nextInt();//user input
        System.out.println("x value Entered:"+x);
        //creating y value
        System.out.println("Enter y value:");
        int y=input.nextInt();
        System.out.println("y value Entered:"+y);
        int z=x+y;
        int a=x-y;
        int c=x*y;
        float d=x%y;
        int e=x/y;
        System.out.println("sum the two number is"+ z);
         System.out.println("sub the two number is"+ a);
          System.out.println("multi  the two number is"+ c);
           System.out.println("div  the two number is"+ d);
            System.out.println("reminder the two number is"+ e);
            System.out.println("THE END");
             System.out.println("SYSTEM OUT");

    }
    
}
