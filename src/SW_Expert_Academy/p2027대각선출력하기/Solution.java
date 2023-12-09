package SW_Expert_Academy.p2027대각선출력하기;

public class Solution {
    public static void main(String[] args) {
        for(int i=0; i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j) {
                    System.out.print("#");
                }
                else {
                    System.out.print("+");
                }
            }
            System.out.println();

        }



    }
}
