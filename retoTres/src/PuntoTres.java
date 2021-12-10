import java.util.Scanner;
import java.util.Arrays;

public class PuntoTres {
  public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);

    int fila_i;
    int columna_j;

    System.out.print("Ingrese el número de filas que desea que tenga su matriz: ");
    fila_i = Entrada.nextInt();
    System.out.print("Ingrese el número de  columnas que desea que tenga su matriz: ");
    columna_j = Entrada.nextInt();

    double[][] matriz = new double[fila_i][columna_j];

    for(int i = 0; i < fila_i; i++){
      for(int j = 0; j < columna_j; j++){
        System.out.print("A[" + ( i + 1) + "][" + (j + 1) + "]= ");
        matriz[i][j] = Entrada.nextDouble();

      }
    }
    System.out.println(Arrays.deepToString(matriz));
  }
}
