import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[][] = new int[5][5];
		while(true) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == 1) {
				for(int i=0; i<intArr.length; i++) {
					for(int j=0; j<intArr[i].length; j++) {
						intArr[i][j] = 0;
					}
					
					intArr[0][0] = 1;
				}
			}else if(num == -1) {
				
			}else if(num == -2) {
				
			}else if(num == 0) {
				break;
			}else if(num == 2) {
				
			}
		}
	}

}
