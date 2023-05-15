import java.util.Scanner;

public class Test1 {

	    public static void main(String[] args) {
	        int[] arr = new int[10]; 
	        arr[0] = 1; 

	        
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();

	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("이동할 위치를 입력하세요: ");
	        int num = sc.nextInt();

	        
	        arr[num-1] = 1;
	        arr[0] = 0; 
	        
	      
	        for (int i = 0; i < arr.length; i++) {
	        	System.out.print(arr[i] + " ");
	        }
	        
	       
	    }

}
