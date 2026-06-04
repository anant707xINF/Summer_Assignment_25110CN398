import java.util.Scanner;
class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N");
        int n = sc.nextInt();
        int i , f = 1 ;
        for(i = 1 ; i<=n ; i++)
        {
            f = f*i ; 
        }
        System.out.println("THE FACTORIAL OF THE GIVEN NUMBER IS : " + f);

    }
}