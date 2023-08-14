import java.util.Scanner;
public class oddandeven {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);//creat scanner
        System.out.println("ENTER NUMBER:");
        int num=input.nextInt();//user input
        System.out.println("number entered:"+" "+num);
        if(num %2==0)
            System.out.println("GIVEN NUMBER IS ODD");
        else
            System.out.println("GIVEN NUMBER IS EVEN");


    }
    
}
