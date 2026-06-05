import java.util.Scanner;
class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.println("INVALID INPUT");
        }
        int i ;
        int pri ;
        for(i = 2 ; i < n ; i++)
        {
            if(n%i == 0)
            {
                pri = 0 ;
                              break;
            }
        
        }
        
        if(pri == 0)
        {
            System.out.println("number is not prime");
        }
        else
        {
            System.out.println("number is prime");
        }
        

    }
}