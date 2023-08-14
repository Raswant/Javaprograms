
import java.util.Scanner;
public class Grading {
          public static void main(String[] args) {
                    Scanner input = new Scanner (System.in);//creat scanner
                    int marks;
                    System.out.println("ONLINE GRADING SYSTEM");
                    System.out.println("ENTER YOURS MARKS");
                    marks=input.nextInt();
                    if(marks>=85 && marks<=100){
                              System.out.println("MARKS ENTERED"+ " "+marks);
                              System.out.println("STUDENT GOT FIRST CLASS");                            
                              System.out.println("GRADE:A");
                    }else if(marks>=65 && marks<=85){
                              System.out.println("MARKS ENTERED"+ " "+marks);
                              System.out.println("STUDENT GOT SECOUND CLASS");                            
                              System.out.println("GRADE B");
                    }
                     if(marks>=55 && marks<=65){
                              System.out.println("MARKS ENTERED"+ " "+marks);
                              System.out.println("STUDENT GOT SECOUND CLASS");                            
                              System.out.println("GRADE B");

                              System.out.println("MARKS ENTERED"+" "+marks);
                              System.out.println("STUDENT FAIL");

                    }else if(marks>=0 && marks<=55){
                              System.out.println("MARKS ENTERED"+" "+marks);
                              System.out.println("STUDENT FAIL");
                    }

                                       
           }
                  
}
