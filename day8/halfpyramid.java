// Write a program to Print half pyramid pattern. 
import java.util.Scanner;
class halfpyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to which the pattern has to print : ");
        int n = sc.nextInt();
        int i , j ; 
        for(i = 1 ; i<=n ; i++)
        {
            for(j = 1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}