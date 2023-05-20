import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            boolean prime = true;
            if(num==1){
                continue;
            }
            for(int j=2; j<num; j++) { 
                if (num % j == 0) {
                    prime = false;
                }
            }
                if(prime) {
                    count++;
                }
        }
        System.out.println(count);
    }
}