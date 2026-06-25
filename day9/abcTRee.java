//Write a program to Print repeated character pattern. 
// A 
// BB 
// CCC 
// DDDD 
// EEEEE

class abcTRee{
    public static void main(String[] args) {
        char i, j ;
        for(i = 'A' ; i<='E' ; i++){
            for(j = 'A' ; j<=i ; j++){
                System.out.print(i  + " ");
            }
            System.out.println();
        } 

    }
}
