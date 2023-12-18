import java.util.Scanner;
class SumOfTwoNumbers{

    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the First Number:");
         Integer a= s.nextInt();
        System.out.println("Enter the Second Number:");
         Integer b= s.nextInt();
        
          
          Integer  Sum=a+b;
      System.out.println("The Sum is: " + Sum);   

    }
}