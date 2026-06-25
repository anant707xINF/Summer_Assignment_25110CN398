// To check wheather the number is Strong or Not ;
import java.util.Scanner;
class StrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int n = num ;
        int sum = 0, r ,i;
        while(num > 0){
            r = num % 10 ;
            int fact = 1 ;
            for(i = 1 ; i<=r ; i++){
                fact = fact * i ;

            }
            sum = sum + fact ;
            num/=10 ;

        }
        
        if(sum == n){
            System.out.println("strong number");
        }
        else{
            System.out.println("Not strong number");
        }
    }
}