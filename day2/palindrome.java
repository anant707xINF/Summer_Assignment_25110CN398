 import java.util.Scanner;

 class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be checked : ");
        int num = sc.nextInt();
        int origin = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;       
            reverse = reverse * 10 + digit;  
            num /= 10;                  
        }

        if (origin == reverse) {
            System.out.println(origin + " is a Palindrome number.");
        } else {
            System.out.println(origin + " is NOT a Palindrome number.");
        }
    }
}