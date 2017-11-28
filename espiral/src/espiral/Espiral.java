package espiral;
import java.io.*;
/**
 * @date 24-11-2017
 * @author Calmecigadi
 * @version 1
 */

public class Espiral {
	//fill the matrix with random numbers from 0 to 9
	public static void llenar(int [][] matrix, int minRandom, int maxRandom){
		minRandom = 0;
		maxRandom = 9;
		System.out.println("la matriz es : \n");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = minRandom - ((int) Math.round((Math.random()) * (minRandom - maxRandom)));
		    }
		}
	}
	// print the filled matrix		
	public static void imprimir(int [][] matrix){
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++){
				System.out.print("[" + matrix[i][j] + "]");
		    }
			System.out.println("");
		}
	}
	// scroll through the spiral matrix and print the numbers in a row
	public static void espiral(int [][] matrix){
		
		int m = matrix.length;
		int inicio = 0;
		int limite = matrix.length - 1;
		int count = 1;
		int number1;
		
		System.out.println("los numeros del recorrido en espiral son: ");
		// Conditional to print the spiral matrix
		while(count <= m * m){
			for (int i = inicio; i <= limite; i++) {
				number1 = matrix[inicio][i];
				System.out.print("["+number1+"]");
				count++;
			}

			for (int i = inicio+1; i <= limite; i++){
				
				number1 = matrix[i][limite];
				System.out.print("["+number1+"]");
				count++;
			}
				
			for (int i = limite-1; i >= inicio; i--){
				number1 = matrix[limite][i];
				System.out.print("["+number1+"]");
				count++;
			}
			
			for (int i = limite-1; i >= inicio+1; i--){
				number1 = matrix[i][inicio];
				System.out.print("["+number1+"]");
				count++;
			}
		inicio +=1;
		limite -=1;
		}
	}

	public static void main(String[] args) throws IOException { 
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
				
		bw.write("Escriba el tamaño de la Matriz: ");
		bw.flush();
				
		int m = Integer.parseInt(br.readLine());
				
		int [][] matrix = new int [m][m];
		llenar(matrix, m, m);
		imprimir(matrix);
		System.out.println("");
		espiral(matrix);
	}
}