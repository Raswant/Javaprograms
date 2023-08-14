public class Car {
          int i;
          int j;
          public Car(){// Deafult constructor1
                  i=0;
                  j=0;  
          }
          public Car(int i , int j){// Paramatric constructor2
                    this.i=i;
                    this.j=j;
          }
          public static void main(String[] args) {
                    Car S1 = new Car();    // creating object 1
                     Car S2 = new Car(50,50);   // creating object 2
                     Car S3 = new Car(50,20);  // creating object 3
                    Car  S4 = new Car(200, 500);// creating object 4
                    Car  S5 = new Car(400, 500);// creating object 5
                    Car  S6 = new Car(200, 500);// creating object 6
                    Cartypes C2 = new Cartypes("FEARRI", "SPORT");
                    Cartypes C3 = new Cartypes("AUDI", "sport");
                    Cartypes C4 = new Cartypes("BENZE", "SUV");
       // out put statements
                      System.out.println(S1.add());
                       System.out.println(S2.add());
                        System.out.println(S3.add());
                         System.out.println(S4.sub());
                         System.out.println(S5.mul());
                         System.out.println(S6.div());
                        System.out.println(S1==S2);
                        System.out.println(S3==S2);
                        System.out.println(S5==S4);
                        System.out.println(S5==S5);

          }
          public int add() {
                    return i+j;

          }
          public int sub() {
                    return i-j;

          }
           public int mul() {
                    return i*j;

          }
           public int div() {
                    return i%j;

          }
       
       
          
}
