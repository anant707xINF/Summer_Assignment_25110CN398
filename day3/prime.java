import java.util.Scanner;
class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number by the user");
        int num = sc.nextInt();
        
        if(num == 1)
        {
            System.out.println("Prime");
        }

        int i ;

        for(i = 2 ; i<num ; i++) // updation in every step .
        {
            if(num % i == 0)
            {
                System.out.println("Not Prime");
                break; 
            }

        }
        if(i == num)
        {
            System.out.println("Prime");
        }
    }
} 