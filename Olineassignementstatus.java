import java.util.Scanner;
import java.util.scanner;
public class Olineassignementstatus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//creat scanner
        System.out.println("ENTER YOUR MARKS:");
        int mymarks=input.nextInt();//user input
        System.out.println("MARKS ENTERED:"+mymarks);
       if(mymarks>100)//conduction statement
            System.out.println("SUCESSFULLY ASSIGNEMENT COMPLETED WAIT FOR HR CALL");
       else
        System.out.println("GO to home");
        

    }
    
}
