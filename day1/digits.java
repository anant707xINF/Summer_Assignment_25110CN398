 /* import java.util.Scanner;
class digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        String num = sc.next();
        System.out.println("DIGITS IN NUMBER ARE : " + num.length() );
        
    }
} */


    import java.util.Scanner;
    class digits{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE VALUE OF N ");
            long num = sc.nextLong();
            int count ; 
            for(count = 0 ; num > 0 ; num = num/10)
            {
                count++ ; 
            }
            System.out.println("THE DIGITS IN THE NUMBER ARE");
            System.out.println(count);
        }
    }