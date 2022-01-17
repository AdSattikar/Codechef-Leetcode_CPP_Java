public class advpatterns {
    public static void main(String[] args) {
        //butterfly pattern
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++)
        //         System.out.print("*");
        //     for(int j=1;j<=(2*(n-i));j++) //printing the spaces
        //         System.out.print(" ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("*");
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++)
        //         System.out.print("*");
        //     for(int j=1;j<=(2*(n-i));j++)
        //         System.out.print(" ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("*");
        //     System.out.println();
        // }
        
        //Solid Rhombus
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++)
        //         System.out.print(" ");
        //     for(int j=1;j<=n;j++)
        //         System.out.print("*");
        //     System.out.println();
        // }

        //Number Pyramid
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++) //prints Space
        //         System.out.print(" ");
        //     for(int j=1;j<=i;j++)   //prints numbers
        //         System.out.print(i+" "); 
        //     System.out.println();
        // }

        //Number Palindrome
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++)
        //         System.out.print(" ");//Prints Space
        //     for(int j=i;j>=1;j--)
        //         System.out.print(j);//Prints first half of palindrome..
        //     for(int j=2;j<=i;j++)
        //         System.out.print(j);//Prints 2nd half of palindrome..
        //     System.out.println();
        // }

        //Diamond
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) 
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)   
                System.out.print("*"); 
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++) 
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)   
                System.out.print("*"); 
            System.out.println();
        }
    }
}
