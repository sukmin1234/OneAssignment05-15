import java.util.*;
import java.util.Arrays;
public class moveUp {
	public static void main(String[] args) {
		 int[][] array = new int[5][5];
	        array[0][0] = 1;
	        while (true) {
	            for (int i = 0; i < 5; i++) {
	                for (int j = 0; j < 5; j++) {
	                    System.out.print(array[i][j] + " ");
	                }
	                System.out.println();
	            }
	            Scanner scanner = new Scanner(System.in);
	            int input = scanner.nextInt();
	            if (input == 1) {
	                moveRight(array);
	            } else if (input == -1) {
	                moveLeft(array);
	            } else if (input == 2) {
	                moveUp(array);
	            } else if (input == -2) {
	                moveDown(array);
	            } else if (input == 0) {
	                break;
	            } else {
	                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
	            }
	        }
	    }
	    public static void moveRight(int[][] array) {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 4; j++) {
	                if (array[i][j] == 1) {
	                    array[i][j] = 0;
	                    array[i][j + 1] = 1;
	                    return;
	                }
	            }
	        }
	        System.out.println("더 이상 오른쪽으로 이동할 수 없습니다.");
	    }
	    public static void moveLeft(int[][] array) {
	        for (int i = 0; i < 5; i++) {
	            for (int j = 1; j < 5; j++) {
	                if (array[i][j] == 1) {
	                    array[i][j] = 0;
	                    array[i][j - 1] = 1;
	                    return;
	                }
	            }
	        }
	        System.out.println("더 이상 왼쪽으로 이동할 수 없습니다.");
	    }
	    public static void moveUp(int[][] array) {
	        for (int i = 1; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (array[i][j] == 1) {
	                    array[i][j] = 0;
	                    array[i - 1][j] = 1;
	                    return;
	                }
	            }
	        }
	        System.out.println("더 이상 위로 이동할 수 없습니다.");
	    }
	    public static void moveDown(int[][] array) {
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (array[i][j] == 1) {
	                    array[i][j] = 0;
	                    array[i + 1][j] = 1;
	                    return;
	                }
	            }
	        }
	        System.out.println("더 이상 아래로 이동할 수 없습니다.");
	    }
    }
