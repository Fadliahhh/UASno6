
public class BelahketupatPattern 
{
    public static void main(String args[])
    {
        
        
        int a = 5;
        for (int r = 1; r<=a;r++){
          for (int t = r; t<=a; t++) {
             System.out.print(" "); // decreasing
          }
          for (int j = 1; j<=r; j++) { // increasing
             System.out.print("|=");
          }
          System.out.println();
       }
       for (int i = 1; i<=a ; i++) {

          for (int j = 1; j<=i; j++) { // increasing
             System.out.print(" ");
          }
          for (int j = i; j<=a; j++) { // decreasing
             System.out.print("=|");
          }
          System.out.println();
       } 
}
}