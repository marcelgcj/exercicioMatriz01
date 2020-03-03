package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o tamanho da matriz: ");
		int n = scan.nextInt();
		scan.nextLine();
		int[][] mat = new int[n][n];
		System.out.println();

		for (int i = 0; i < mat.length; i++) {
			System.out.println("Linha: " + i);
			System.out.println();
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Digite o valor da coluna: " + j);
				System.out.println();
				mat[i][j] = scan.nextInt();
				scan.nextLine();
				System.out.println();
			}
		}
		System.out.println("Matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers: " + count);
		scan.close();
	}
}
