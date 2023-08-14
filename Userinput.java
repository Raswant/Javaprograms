import java.util.Scanner;
 class Userinput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // Create a Scanner object
    //getting double input
    System.out.println("Enter height:");
    double mydouble=input.nextDouble();
    System.out.println("entered height is :"+ mydouble);
    //getting integer input
    System.out.println("Enter age:");
    int myint=input.nextInt();
    System.out.println("age entered is :"+ myint);
    //getting string input
    System.out.println("enter name:");
    String myname=input.next();
    System.out.println("name entered"+myname);
        //total output
    System.out.println("Final data is:"+mydouble+myint+myname);     
    }
    
}
