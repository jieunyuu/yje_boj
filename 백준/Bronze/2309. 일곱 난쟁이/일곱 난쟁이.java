
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[9];
		int sum = 0;
		int a = 0, b=0;
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt(); 
			sum += arr[i]; 
		}
		
		Arrays.sort(arr); 
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(sum - arr[i]-arr[j] == 100){
					a = i;
					b = j;
					break;
				}
			}
		}

		
		for(int i = 0; i<arr.length; i++) { 
			if(i == a || i == b)   
				continue;
			System.out.println(arr[i]);
		}
	}
}