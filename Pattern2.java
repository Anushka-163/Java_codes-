# Java_codes-
import java.util.*;
public class solution_patter2{
    public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              int x=sc.nextInt();
              for(int i=1;i<=x;i++){
                  for(int j=x+1;j>i;j--) System.out.print("*");
              System.out.println();
              }
    }
}
