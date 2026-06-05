import java.util.Scanner;
class product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ");
        int num = sc.nextInt();
        int pro = 1 , r ;
        for( ; num>0 ; num = num/10)
        {
            r = num%10 ;
            pro = pro*r;
        }
        System.out.println("THE PRODUCT OF DIGITS OF NUMBER IS : " + pro);
    }
}