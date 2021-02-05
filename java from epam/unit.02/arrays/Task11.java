import java.util.*;

public class Task11{
	private static Random random = new Random();
	private static int [][] matrix(int height, int width){
		int[][] matrixA = new int[height][width];
		for(int i = 0; i < height; i++){
			System.out.println((i + 1)+ " row of the matrix: ");
			for(int j = 0; j < width; j++){
				matrixA[i][j]= random.nextInt(100);
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		return matrixA;
	}
	private static int[][] oddColumnsThereFirstMoreThenLast(int mat[][]){
		int [][] matrix = mat;
		int height = matrix.length;
		int width = matrix[0].length;
        for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j += 2){
				if(matrix[0][j] > matrix[height - 1][j]){
					System.out.println(matrix[i][j] + "\t");
				}
			}
		}
        return matrix;		
	}
	public static void main (String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter height of the matrix");
		int heightM = scanner.nextInt();
		System.out.println("enter width of the matrix");
		int widthM = scanner.nextInt();
		int[][] myMatrix = matrix (heightM, widthM);
		System.out.println("Required columns: ");
		int[][] answer = oddColumnsThereFirstMoreThenLast(myMatrix);
	}
}