public class Third {
    public static void main(String[] args) {
        int n=15;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 | j==(n-1) ||
                        i==0 | i==(n-1) ||
                        i==1 && j>=0 && j<=(n-1) && j!=(n*4)/10 ||
                        i==2 && j>0 && j<(n*3)/9 | j>(n*2)/4 && j<(n-1) ||
                        i==3 && j>0 && j<=(n/5) | j>(n*4)/7 && j<(n-1) ||
                        i==4 && j>0 && j<=(n/6) | j>(n*4)/6 && j<(n-1) ||
                        i==5 && j==1 | j==(n-2) ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
