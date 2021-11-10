package hust.longpr.basejava;

import java.util.Scanner;

public class MatrixSquere {
	static int i;
	static int j;
	static int a[][] = new int[100][100];
	static int n;

	static void inputMatrix(int a[][], int n) {
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("a" + "[" + i + "]" + "[" + j + "]" + " = ");
				Scanner sc = new Scanner(System.in);
				a[i][j] = sc.nextInt();// printf("%d",&a[i][j]);
			}
		}
	}

	static void outputMatrix(int a[][], int n) {
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void matrixTranspositon(int a[][], int n) {
		int temp;
		for (i = 0; i < n; i++) {
			for (j = 0; j < i; j++) {
				temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		outputMatrix(a, n);
	}

	static void matrixRowCol(int a[][], int n) {
		int b[][] = new int[100][100];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (a[i][j] == 1) {
					for (int k = 0; k < n; k++) {
						b[i][k] = 1;
						b[k][j] = 1;
					}
				} else {
					if (a[i][j] == b[i][j]) {
						b[i][j] = 0;
					}
				}
			}
		}
		outputMatrix(b, n);
	}

	static void deleteRow(int a[][], int n, int r) {// r la dong can xoa
		int row = n;
		int col = n;
		for (i = r; i < row - 1; i++) {
			for (j = 0; j < col; j++) {
				a[i][j] = a[i + 1][j];
			}
		}
		row--;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n = ");
		n = sc.nextInt();
		System.out.println("Nhap ma tran:");
		inputMatrix(a, n);
		System.out.println("Xuat ma tran:");
		outputMatrix(a, n);
		System.out.println("Ma tran chuyen vi a thanh b:");
		matrixTranspositon(a, n);
		System.out.println("Ma tran chuyen vi b thanh a:");
		matrixTranspositon(a, n);
		System.out.println("Ma tran tai a[i][j]=1:");
		matrixRowCol(a, n);
		System.out.print("Xoa hang thu r = ");
		int r = sc.nextInt();
		deleteRow(a, n, r);
	}

}
