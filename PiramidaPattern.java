public class PiramidaPattern {
    public static void PyramidPattern(int w) {
        for(int f = 0; f<w; f++){
            for (int j=w-f; j>1; j--){
                System.out.print(" ");
            }
            for(int d=0; d<=f; d++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 10;
        PyramidPattern(n);
    }
}
