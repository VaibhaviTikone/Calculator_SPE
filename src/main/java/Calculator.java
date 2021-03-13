import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import  java.util.InputMismatchException;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logging = LogManager.getLogger(Calculator.class);

    public Calculator(){}

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int choice;
        logging.info("Starting the calculator");
        System.out.println("\n\n\n\n----------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tWelcome to scientific calculator");
        do{
            try{

                System.out.println("\n1. Square root \n2. Factorial\n3. Natural log\n4. Power\n5. Exit");
                System.out.print("\nEnter your choice: ");
                choice = scanner.nextInt();
            }
            catch (InputMismatchException im)
            {
                logging.error("[ERROR]: Expecting integer value encountered different value type. ");
                return;
            }
            switch(choice)
            {
                case 1: //square root
                    double sqrt;
                    try
                    {
                        System.out.print("Enter value: ");
                        sqrt = scanner.nextDouble();
                    }
                    catch (InputMismatchException im)
                    {
                        logging.error("[ERROR]: Expecting double value encountered different value type. ");
                        return;
                    }
                    System.out.println("Square root of " + sqrt + ": " + calc.Sqrt(sqrt));
                    System.out.println("======================================================");
                    break;
                case 2: //Factorial code
                    double fact;
                    System.out.print("Enter the value: ");
                    try{
                        fact = scanner.nextInt();
                    }
                    catch (InputMismatchException im)
                    {
                        logging.error("[ERROR]: Expecting integer value encountered different value type. ");
                        return;
                    }
                    double result;
                    if(fact >=0){
                        result = calc.Factorial(fact);
                        System.out.println("Factorial of " + fact + " = " + result);
                        System.out.println("======================================================");
                    }
                    else{
                        logging.error("[ERROR]: Factorial is not defined for Negative numbers");
                        return;
                    }
                    break;

                case 3: // Natural log
                    double logVal;
                    try {
                        System.out.print("Enter value: ");
                        logVal= scanner.nextDouble();

                    }
                    catch (InputMismatchException ime)
                    {
                        logging.error("[ERROR]: Expected Double but got different type. Try again!!");
                        return;
                    }
                    if(logVal>0) {
                        System.out.println("Log of " + logVal + ": " + calc.Log(logVal));
                        System.out.println("======================================================");
                    }
                    else{
                        logging.error("[ERROR]: Log is not defined for Negative numbers and 0");
                        return;
                    }
                    break;
                case 4: // power function
                    double base,exp;

                    try {
                        System.out.print("Enter base value: ");
                        base = scanner.nextDouble();
                        System.out.print("Enter exponent value: ");
                        exp = scanner.nextDouble();

                    }
                    catch (InputMismatchException ime) {
                        logging.error("[ERROR]: Value type mismatch.Expected Double got other type. ");
                        return ;
                    }
                    System.out.println(base + " raised to " + exp +": "+calc.Power(base,exp));
                    System.out.println("======================================================");

                    break;
                default:
                    logging.info("[INFO]: Exiting, entered choice doesn't have any functionality.");
            }
        }while(choice<=4);
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t Thanks for visiting");
        System.out.println("----------------------------------------------------------------------------------------------");
    }

    public double Sqrt(double sqrt)
    {

        logging.info("[INFO]: value: " + sqrt);
        if(sqrt<0)
        {
            logging.error("[ERROR]: square root is not defined for negative numbers");
            return Double.NaN;
        }
        return Math.sqrt(sqrt);
    }


    public double Factorial(double n)
    {
        logging.info("[INFO]: I/P for factorial: " + n);
        if(n<0) return Double.NaN;
        double factorial=1;
        for(int i = 2; i <= n; ++i)
        {

            factorial*=i;
        }
        logging.info("[INFO]: Factorial result: " + factorial);
        return factorial;
    }

    public double Log(double logVal)
    {
        logging.info("[INFO]: Value: "+logVal);
        return Math.log(logVal);
    }
    public double Power(double base, double exp)
    {
        logging.info("[INFO]: Base: "+base +" Exponent: "+exp);
        if(base==0 && exp ==0)
            return Double.NaN;
        return Math.pow(base,exp);
    }
}