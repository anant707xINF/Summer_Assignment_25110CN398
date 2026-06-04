 /* import java.util.Scanner;
class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of N : ");
        int n = sc.nextInt();
        int i ;
        for(i = 1 ; i<=10 ; i++)
        {
            System.out.println(n   +  "*"  +  i   +  "="  +  n*i); // system.out.println(n*i), we can also use this to get final value of multiplictions.

        }
    }
} */

    import java.util.Scanner;
    class table{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of N");
            int n = sc.nextInt();
            int i ;
            for(i =1 ; i<=10 ; i++)
            {
                System.out.printf("  %d*%d=%d\n",n,i,n*i);
            }
        }
    }