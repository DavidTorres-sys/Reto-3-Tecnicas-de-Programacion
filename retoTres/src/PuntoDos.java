import java.util.Arrays;
import java.util.Scanner;

public class PuntoDos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //------------primera matrix -----------//
    System.out.print("Ingrese el tamaño n:");
    int m1 = input.nextInt();
    System.out.print("Ingrese el tamaño m:");
    int n1 = input.nextInt();

    int[][] matrixA = new int[m1][n1];

    for (int i = 0; i < m1; i++) {
      for (int j = 0; j < n1; j++) {
        System.out.print("A[" + i + "][" + j + "]= ");
        matrixA[i][j] = input.nextInt();
      }
    }
    //---------------- Segunda matrix ---------------//
    System.out.print("Ingrese el tamaño n:");
    int m2 = input.nextInt();
    System.out.print("Ingrese el tamaño m:");
    int n2 = input.nextInt();

    int[][] matrixB = new int[m2][n2];

    for (int i = 0; i < m2; i++) {
      for (int j = 0; j < n2; j++) {
        System.out.print("A[" + i + "][" + j + "]= ");
        matrixB[i][j] = input.nextInt();
      }
    }
    //-----------------Mostrar matrices ----------------//
    System.out.println(Arrays.deepToString(matrixA));
    System.out.println(Arrays.deepToString(matrixB));
    //-----------------Producto punto --------------------//
    int matrixResultado[][] = new int[matrixB.length][matrixB[0].length];
    for(int i = 0; i < matrixA.length; i++) {
      for(int j = 0; j < matrixB[0].length; j++) {
        for(int k = 0; k < matrixA[0].length; k++) {
          matrixResultado[i][j] += (matrixA[i][k] * matrixB[k][j]);
        }

      }
    }
    System.out.println("Resultado");
    System.out.println(Arrays.deepToString(matrixResultado));
  }
}
