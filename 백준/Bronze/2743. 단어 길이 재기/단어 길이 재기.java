import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;
        String s=sc.next();
        for (int i=0;i<s.length();i++){
            n++;
        }
        System.out.println(n);
    }
}