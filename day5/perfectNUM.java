// Program to check Perfect Number ;
import java.util.Scanner;
class perfectNUM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number greater than 1  : ");
        int num = sc.nextInt();
        int i , sum = 0 ;
        if(num > 0){
        for(i = 1 ; i<num ; i++){
            if(num % i == 0){
                sum = sum + i ;
            }

        }
        if(num == sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        
        }
    }
    }
}