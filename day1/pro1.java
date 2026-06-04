/* import java.util.Scanner;
class pro1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n = sc.nextInt();
        int totalsum = (n*(n+1))/2;
        System.out.println("THE SUM OF FIRST N NATURAL NUMBERS IS : " + totalsum);
    }
} */

    import java.util.Scanner;
    class pro1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of N");
            int n = sc.nextInt();
            int i , sum = 0 ;
            for(i = 1 ; i<=n ; i++)
            {
                sum = sum + i ; 
            }
            System.out.println("the sum of N natural numbers is : " + sum);
        }
    }