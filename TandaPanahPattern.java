public class TandaPanahPattern {
    public static void main(String[] args)
    {
        int rows = 5 ;  
        for (int a=1; a<=rows; a++)
        {
            for (int b = 1; b <= a; b++)
            {
                System.out.print("{} ");
            }
            for (int c = a*2; c <= rows*2-1; c++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= a; l++)
            {
                System.out.print("{} ");
            }
            System.out.println();
        }
       
        for (int i=1; i<=rows-1; i++){
            for (int j = rows-1; j >= i; j--)
            {
                System.out.print("{} ");
            }
            for (int k = 1; k <= i*2; k++) {System.out.print(" ");}
            
            for (int l = rows-1; l >= i; l--)
            {
                System.out.print("{} ");
            }
           
            System.out.println();
        }
        }
}

