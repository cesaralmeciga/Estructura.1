package merge.sort;
import java.io.*;
import java.util.Arrays;
/*
*@Author Calmecigadi
*@date 26-11-17
*@Version 1
*Sorting by the method Merge sort
*/
public class metodos {
	
	 public static void imprimeArray(int[] array){
	        for (int i = 0; i < array.length; i++) {
	            System.out.print("[" + array[i] + "]");
	        }
	    }

	 
	  public static void ordenacionMergeSort(int vec[]){
          if(vec.length<=1) return;
          int mitad= vec.length/2;
          int izq[]=Arrays.copyOfRange(vec, 0, mitad);
          int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
          ordenacionMergeSort(izq);
          ordenacionMergeSort(der);       
          combinarVector(vec, izq, der);
  }
  
  public static void combinarVector(int v[], int izq[],int der[]){
          int i=0;
          int j=0;
          for(int k=0;k<v.length;k++){
                  if(i>=izq.length){
                          v[k]=der[j];
                          j++;
                          continue;
                  }
                  if(j>=der.length){
                          v[k]=izq[i];
                          i++;
                          continue;
                  }
                  if(izq[i]<der[j]){
                          v[k]=izq[i];
                          i++;
                  }else{
                          v[k]=der[j];
                          j++;
                  }
          }
  }
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));	
	BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	
	metodos c = new metodos() ;
		
	bw.write("escriba el tamaño del arreglo ");
	bw.flush();	
	int T = Integer.parseInt(br.readLine());
		
	bw.write("escriba los numeros del arreglo separados por comas  \n");
	bw.flush();
	String Arreglo= br.readLine();
		String [] Particion = Arreglo.split(",");
		int array [] = new int [T]; 
	
		for (int i = 0; i < array.length; i++) {
			  array[i]=Integer.parseInt(Particion[i]);
			}
		
		c.imprimeArray(array);
		System.out.println("\n"+"Merge Sort");
		c.ordenacionMergeSort(array);
		c.imprimeArray(array);
		

	
  }

}