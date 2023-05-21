import java.util.Scanner;


public class move {

	public static void main(String[] args) {
		int[] arr = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
		

        Scanner sc = new Scanner(System.in);
        int move = 0;
        
        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        while (true) {
            System.out.print("이동할 방향을 입력하세요 -1: 왼쪽, 1: 오른쪽 ");
            move = sc.nextInt();


            if (move == 1) {
                
                for (int i = arr.length-1; i > 0; i--) {
                    arr[i] = arr[i-1];
                }
                arr[0] = 0;
            } else if (move == -1) {
               
                for (int i = 0; i < arr.length-1; i++) {
                    arr[i] = arr[i+1];
                }
                arr[arr.length-1] = 0;
            } else {
                
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
		
	
		
	}

}
