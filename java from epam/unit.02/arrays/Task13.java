import java.util.*;

public class Task13{
/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
**/
	private static Random random = new Random();
	private static int [][] matrix(int heigth, int width){
		int[][]matrix = new int[heigth][width];
		for(int col = 0; col < heigth; col++){
			System.out.println((col + 1)+ " row of the matrix: ");
			for(int row = 0; row < width; row++){
				matrix[col][row] = random.nextInt(100);
				System.out.print(matrix[col][row] + " ");
			}
			System.out.println();
		}
		System.out.println();
		return matrix;		
	}
	private static int [][]rowMatrix(int[][]givenMatrix, int number){
		int [][] matrix = givenMatrix;
		int rowNumber = number;
		int heigth = givenMatrix.length;
		int width = givenMatrix[0].length;
		System.out.println("numbers of row N:");
		for(int col = 0; col < heigth; col++){
			for(int row = 0; row < width; row++){
				if(col == rowNumber -1){
					System.out.print(matrix[col][row]+ " ");
				}
			}
		}
		System.out.println();
		return matrix;
	}
	private static int[][]colMatrix(int[][]givenMatrix, int number){
		int[][] matrix = givenMatrix;
		int colNumber = number;
		int heigth = givenMatrix.length;
		int width = givenMatrix[0].length;
		System.out.println("numbers of column N:");
		for(int col = 0; col < heigth; col++){
			for(int row = 0; row < width; row++){
				if(row == colNumber - 1){
					System.out.print(matrix[col][row] + " ");
				}
			}
		}
		System.out.println();
		return matrix;
	}
	public static void main(String[]args){
		int[][]myMatrix = matrix(4, 5);
		int rowN = 3;
        int[][]row = rowMatrix(myMatrix, rowN);
        int colN = 2;
        int[][]col = colMatrix(myMatrix, colN);		
	}
}