package espiral2;
/*
*@date 11-11-17
*@author Calmecigadi
*@Version 1
*/

import java.util.Scanner;

public class Espiral2
{
 public static void main(String[] args)
 {
 
  Scanner leer = new Scanner(System.in);
  System.out.println("Este programa genera una matriz dependiendo del numero ingresado y hace que la imprime en forma de espiral\n");
  System.out.println("digite el numero del tamaño de la dimension:");
  int tamaño = leer.nextInt();
  int n, x, i, y;
  int c = 0;
  int inicio = 0;
  int limite = tamaño-1;
  int numero_buscar;
  
  int [][] matriz = new int [tamaño][tamaño];
  
  //Conditional to print the spiral matrix
  for(n = 1; n <= (tamaño * tamaño); n++)
  {
   //from left to right

   
   for(x = inicio; x<= limite; x++)
   {
    matriz[inicio][x]=c++;
   }
   
   //from up to down

   for(x=inicio+1; x<= limite; x++)
   {
    matriz[x][limite]=c++;
   }
   
   //from right to left
   for(x = limite-1; x >= inicio; x--)
   {
    matriz[limite][x]=c++;
   }
   //from bottom to top
   for(x = limite-1; x >= inicio+1; x--)
   {
    matriz[x][inicio]=c++;
   }
   inicio=inicio+1;
   limite=limite-1;
  }
  
  //print the matrix
  System.out.println("La matriz en forma de caracol de "+tamaño+" dimensiones es:\n");
  
  for(y = 0; y < tamaño; y++)
  {
   for(x = 0; x < tamaño; x++)
   {
    System.out.print(matriz[y][x]+"\t");
   }
   System.out.println(" ");
  }
  
  System.out.println("Digite el numero que dessea buscar:\n");
  numero_buscar=leer.nextInt();
  int bandera=0;
  for(y = 0; y < tamaño; y++)
  {
   for(x = 0; x < tamaño; x++)
   {
    if ( numero_buscar == matriz[y][x])
    {
     System.out.println("El numero se encuentra en la posicion: "+x+","+y);
     bandera=1;
    }
    
   }
  
  }
  if (bandera==0)
  {
   System.out.println("el numero no se encuentra en la matriz");
  }
 }
}