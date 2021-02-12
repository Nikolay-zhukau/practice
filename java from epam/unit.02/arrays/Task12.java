import java.util.*;

public class Task12{
/*	Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
**/
	private static Random random = new Random();
	private static int [][] squareMatrix(int side){
		int[][]matrix = new int[side][side];
		for(int col = 0; col < side; col++){
			System.out.println((col + 1)+ " row of the matrix: ");
			for(int row = 0; row < side;row++){
				matrix[col][row] = random.nextInt(100);
				System.out.print(matrix[col][row] + " ");
			}
			System.out.println();
		}
		return matrix;		
	}
	private static int[][]diagonalLeft(int matrix[][]){
		System.out.println("the left diagonal of the square is: ");
		int [][]myMatrix = matrix;
        int heigth = matrix.length;
        int width = matrix[0].length;
        for(int col = 0; col < heigth; col++){
			for(int row = 0; row < width; row++){
				if(col == row){
					System.out.print(MyMatrix[col][row] + " ");
				}
			}
		}
        return myMatrix;		
	}
	private static int [][]diagonalRight(int matrix[][]){
		System.out.println("the right diagonal of the square is: ");
		int [][] myMatrix = matrix;
		int heigth = matrix.length;
		int width = matrix[0].length;
		int count = width;
		for(int col = 0; col < heigth; col++){
			for(int row = 0; row < width; row++){				
				if(row == count-1){
					System.out.print(MyMatrix[col][row]+ " ");
					count--;
				}
			}
		}
		return MyMatrix;
	}
	public static void main(String[]args){
		int n = 5;
		int [][] square = squareMatrix(n);
		int [][] anser = diagonalLeft(square);
		System.out.println();
        int	[][] anserTwo = diagonalRight(square);
        System.out.println();		
	}
}