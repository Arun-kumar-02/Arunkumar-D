import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int count = (num%2) == 0 ? num-1 : num;
        int number = 1;

        for(int i=1; i<=count; i++)
        {
            System.out.print(number);
            if(i < count) System.out.print(", ");
            number +=2;
        }
        sc.close();
    }
}
