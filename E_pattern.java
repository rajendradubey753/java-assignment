public class E_pattern {
    public static void main(String[] args) {
        int n=15;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0&&j<(n-1)/2||i==(n-1)/2&&j<(n-1)/2||j==0&&i<(n-1)/2||i==3&&j<(n-1)/2)
                {
                    System.out.print("*"+" ");

                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();

        }
    }
    
}
