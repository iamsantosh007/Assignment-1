public class Fourth {
    public static void main(String[] args) {
        int a=8;
        for(int i=1;i<=8;i++){
            for(int j=1;j<=(a-1)*2;j++){
                if(j<=i || j>((a-1)*2)-i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
