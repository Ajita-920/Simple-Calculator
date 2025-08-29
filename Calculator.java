import java.util.Scanner;
public class Calculator {

    public static double add(double a, double b){
        return a+b;
    }
    public static double subtract(double a, double b){
        return a-b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("Error: Division by zero case!");
                    return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        boolean calculating=true;

        System.out.println("Welcome to CLI Calculator");

        while(calculating){
            System.out.println("\n Select an Operation");
            System.out.println("\n 1.Addition");
            System.out.println("\n 2.Subtraction");
            System.out.println("\n 3.Multiplication");
            System.out.println("\n 4.Division");
            System.out.println("\n 5. Exit");
            System.out.println("\n Enter your choice : ");


            int choice = sc.nextInt();

            if(choice==5){
                calculating=false;
                System.out.println("Existing");
                break;
            }
            System.out.println("Enter First Number");
            double num1=sc.nextDouble();

            System.out.println("Enter second Number");
            double num2=sc.nextDouble();

            double result=0;

            switch(choice){
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiplication(num1, num2);
                    break;
                case 4:
                    result = division(num1, num2);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    continue;
            }

            System.out.println("Result : " + result);
        }
        sc.close();
    }

}
