class patttern3 {
    public static void main(String[] args) {
        int n = 16;
        for (int i=0; i< n; i++)

        {
            for (int j = 0; j < n; j++)
               {
                //if (i==j||i+j==n-1||i==0|i==n-1||j==(n-1)/2) 
                if(i+j==(n-1)/2)
                {
                    System.out.print("*");
                }  else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }

    }

}
