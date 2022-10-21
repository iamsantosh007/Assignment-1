public class Ineuron {
    public static void main(String[] args) {
        int outer=5;
        int inner=5;
        for(int i=0;i<outer;i++){
            for(int j=0;j<inner;j++){
                if(i==0 | i==(outer-1) && j!=(outer*1)/2 || j==(outer*1)/2 ){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < inner; j++) {
                if(j==0 || j==4 || i>0 && i<(outer-1) && i==j){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < inner; j++) {
                if(i==0 | i==(outer*2)/4 |i==(outer-1) | j==0){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < inner; j++) {
                if(j==0 | j==(inner-1) && i<(outer-1) || i==(outer-1) && j>0 && j<(inner-1)){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < inner; j++) {
                if(j==0 ||i==0 && j>0 && j<(inner-1) || i==(outer*2)/4 && j<=(inner*2)/4 || i==(outer-1) && j==(inner*3)/4 || i==1 && j==3 || i==3 && j==2){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < inner; j++) {
                if(i==0 | i==(outer-1) && j>0 && j<=(inner-2) || j==0 | j==(inner-1) && i>0 && i<(outer-1)){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < inner; j++) {
                if(j==0 || j==4 || i>0 && i<(outer-1) && i==j){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }



    }
}
