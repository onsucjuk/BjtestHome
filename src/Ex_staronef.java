public class Ex_staronef {
    public static void main(String[] args){
        for(int i = 0, j = 1; i<j && j<=5; i++){
            System.out.print("*");
            if(i==j-1){
                i=-1;
                j++;
                System.out.println();
            }
        }
    }
}
