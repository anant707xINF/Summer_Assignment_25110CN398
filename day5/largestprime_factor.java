// Program to Print Largest prime factor of a number  ;

import java.util.Scanner;
class largestprime_factor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int i,j , p = 1 ;
        for(i = 1 ; i<=num ; i++){
            if(num % i == 0){
                for(j = 2 ; j<i ; j++){
                    if(i%j == 0){
                        break ;
                    }
                }
                if(i == j && j>p){
                    p = j ;
                }
                

            }

        }
        System.out.print("The largest prime factor of the given number is : " + p);

    }
}

