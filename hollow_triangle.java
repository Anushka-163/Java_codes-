# Java_codes-
  import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int os=n/2,is=-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=os;j++) System.out.print("\t");
        System.out.print("*");
        for(int k=1;k<=is;k++) System.out.print("\t");
        if(i>=2&&i<=n-1) System.out.print("\t*");
        System.out.println();
        if(i<=(n/2)){
            is+=2;
            os-=1;
        }else{
            is-=2;
            os+=1;
        }
    }
}
