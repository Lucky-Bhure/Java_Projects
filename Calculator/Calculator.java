import java.util.*;

class Calculator{
    public static void main(String[] args){
        // Choose any Operation 
        System.out.println("Choose: \n 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division \n 5. Module");
        // Input Choice
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();


        // Input of numbers
        int number1 = 0;
        int number2 = 0; 

        if(0 < choice & choice <= 3){
            System.out.println("Enter first number : ");
            number1 = sc.nextInt();
            System.out.println("Enter second number : ");
            number2 = sc.nextInt();
        }
        else if (3 < choice & choice <= 5){
            System.out.println("Enter Dividend number : ");
            number1 = sc.nextInt();
            System.out.println("Enter Divisor number : ");
            number2 = sc.nextInt();
        }

        // Operation and Result
        switch(choice){
            case 1: System.out.println("Addition of "+ number1+" and "+ number2+ " is "+ (number1 + number2));
            break;
            case 2: System.out.println("Substraction of "+ number1+" and "+ number2+ " is "+ (number1 - number2));
            break;
            case 3: System.out.println("Multiplication of "+ number1+" and "+ number2+ " is "+ (number1 * number2));
            break;
            case 4: System.out.println("Division of "+ number1+" and "+ number2+ " is "+ (number1 / number2));
            break;
            case 5: System.out.println("Module of "+ number1+" and "+ number2+ " is "+ (number1 % number2));
            break;
            default: System.out.println("Invalid Choice");
        }
    }
}