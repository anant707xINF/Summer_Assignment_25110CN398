// Program to print factors of a Number ;

import java.util.Scanner;
class countFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int i ;
        System.out.println("The factors of " + num + " are : ");
        for(i = 1 ; i<=num ; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}