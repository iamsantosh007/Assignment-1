public class fifth {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=0;j<14;j++){
                if( i>1 && i<=7 && j<=(14/2)-i || i==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=7;i++){
            for(int j=1;j<=14;j++){
                if(i==7 || i>=1 && i<7 && j<=(i+1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
