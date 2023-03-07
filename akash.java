public class akash {
    public static void main(String[] args) {
        int n =15;
        for(int i=0;i<n;i++)

        {
            for (int j =0;j<n;j++){
              if( i+j==(n-1)/2||j-i==(n-1)/2||i==(n-1)/3&&j>2&&j<n-3 ) {
                System.out.print("*"+" ");

                }
                else{
                    System.out.print(" "+" ");

                }
                    
                

            }
            System.out.print(" ");
            for(int j=0;j<n;j++){
                if(j==0&&i<=(n-1)/2||i-j==n-12&&j<n-10||i+j==(n-11))
                
                {
                System.out.print("*"+" ");
                   }
                else
                {
                    System.out.print(" "+" ");

                }
            }
            for (int j =0;j<n;j++){
                if( i+j==(n-1)/2||j-i==(n-1)/2||i==(n-1)/3&&j>2&&j<n-3 ) {
                  System.out.print("*"+" ");
  
                  }
                  else{
                      System.out.print(" "+" ");
  
                  }
                      
                  
  
              }
              System.out.print(" ");
              for(int j=0;j<n;j++){
                if(i==0&&j<(n-1)/2&&j>0||j==0&&i>0&&i<4||i==4&&j>0&&j<(n-1)/2||j==(n-1)/2&&i>4&&i<(n-1)/2||i==n-8&&j<(n-1)/2)
                
                  
                  {
                  System.out.print("*"+" ");
                     }
                  else
                  {
                      System.out.print(" "+" ");
  
                  }
              }
              for(int j =0;j<n;j++){
                if(j==0&&i<(n-1)/2||j==(n-1)/2&&i<(n-1)/2||i==(n-1)/3&&j<(n-1)/2) 
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

    

