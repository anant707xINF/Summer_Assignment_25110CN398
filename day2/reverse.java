import java.util.Scanner;
class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num = sc.nextInt();
        int r ;
        System.out.println("\n");
        for(   ; num > 0 ; num = num/10)
        {
            r = num%10 ;
            System.out.print(r);
        }
        System.out.printf("\n");
        System.out.println("THATS THE REQUIRED REVSERED NUMBER");
    }
}