public class Student {
          int i;
          int j;
          public Student(){// Deafult constructor1
                  i=10;
                  j=20;  
          }
          public Student(int i , int j){// Paramatric constructor2
                    this.i=i;
                    this.j=j;
          }
          public static void main(String[] args) {
                    Student S1 = new Student();    // creating object 1
                     Student S2 = new Student(50,50);   // creating object 2
                      Student S3 = new Student(50,20);  // creating object 3

                      System.out.println("STUDENT ONE GOT"+""+S1.add()+" "+"MARKS");
                       System.out.println("STUDENT TWO GOT"+" "+S2.add()+" "+"MARKS");
                        System.out.println("STUDENT THIRD GOT"+""+S3.add()+" "+"MARKS");

                        System.out.println(S1==S2);
                        System.out.println(S3==S2);
                        System.out.println(S1.add());
                                }
          public int add() {
                    return i-j;
          }
       
}
