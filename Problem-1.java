import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int total = 0;
            int evenNumber = 2; 
            StringBuffer sb = new StringBuffer();
            for(int j = 1 ; j <= n ; j++){
                
                if(j == 1) {
                  total = total + a + (j * b);
                  sb.append(total).append(" ");
                } else if(j == 2){
                  total = total + (j * b);
                  sb.append(total).append(" ");
                 } else {
                     evenNumber = evenNumber * 2;
                     total = total + (evenNumber * b);
                     sb.append(total).append(" ");
                 }
            }
            System.out.println(sb.toString());
        }
        
        in.close();
    }
}
