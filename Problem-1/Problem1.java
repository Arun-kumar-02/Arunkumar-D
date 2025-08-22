import java.util.Scanner;

public class Problem1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd Number: ");
        double b = sc.nextDouble();
        System.out.print("Enter Operater (+, -, *, /, %): ");
        String opr = sc.next();

        Calculater calclater = new Calculater(a,b,opr);

        try{
            System.out.println(calclater.calc());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

class Calculater{
    double a;
    double b;
    String operater;

    Calculater(double a, double b, String operater)
    {
        this.a = a;
        this.b = b;
        this.operater = operater;
    }

    public double calc()
    {
        switch(operater)
        {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            case "%":
                return a%b;
            default:
                throw new IllegalArgumentException("Ivalid operater " + operater);

        }
    }
}