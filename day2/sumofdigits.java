import java.util.Scanner;
class sumofdigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int  num = sc.nextInt();
        int sum = 0 , r ;
        for( ; num > 0 ; num = num/10 )
        {
            r = num % 10 ; 
            sum = sum + r ;
        }
        System.out.println("sum of digits are : "  + sum );
    }
}