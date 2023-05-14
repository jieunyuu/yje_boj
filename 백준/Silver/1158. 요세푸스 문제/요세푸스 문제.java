import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        
        for(int i=1;i<=n;i++) {
        	list.add(i);
        }
        System.out.print("<");
        
        while(!list.isEmpty()) {
        	for(int j=1;j<=k;j++) {
        		if(j==k) {
        			int a=list.remove();
        			if(list.size()==0) {
        				System.out.print(a);
        			}
        			else
        				System.out.print(a+", ");
        		}
        		else {
        			list.add(list.remove());
        		}
        	}
        }
        System.out.print(">");
    }
}


