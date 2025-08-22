import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int number = 1;

        for(int i=1; i<=num; i++)
        {
            System.out.print(number);
            if(i < num) System.out.print(", ");
            number+=2;
        }
        sc.close();
    }
}
