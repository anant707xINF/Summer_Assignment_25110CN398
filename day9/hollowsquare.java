// Write a program to Print hollow square pattern. 
//     ***** 
//     *   *  
//     *   *   
//     *   *    
//     *****

class hollowsquare{
    public static void main(String[] args) {
        int i, j ,s ;
        for(i = 1 ; i<=5 ; i++){
            if(i==1 || i==5){
                for(j = 1 ; j<=5 ; j++){
                    System.out.print("*");
                }
            }
            else{
                for(j = 1 ; j<=5 ; j++){
                    if(j==1 || j==5){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}