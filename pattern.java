class pattern{
    public static void main(String[] args) {
        int n =19;
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                if(j==0||i==0||i+j<=(n-1)/2||j-i>=(n-1)/2||j==n||i==n-1)
                {
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        
    }
}