import java.util.Arrays;
import java.util.Scanner;

public class PuntoDos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //------------primer Vector -----------//
    System.out.print("Ingrese el tamaño del vector A:");
    int m1 = input.nextInt();

  int[] vectorA = new int[m1];

    for (int i = 0; i < m1; i++) {
      System.out.print("A[" + (i + 1) + "] = ");
      vectorA[i] = input.nextInt();
    }
    //---------------- Segundo Vector--------------//
    System.out.print("Ingrese el tamaño del vector B:");
    int m2 = input.nextInt();

    int[] vectorB = new int[m2];

    for (int i = 0; i < m2; i++) {
      System.out.print("A[" + (i + 1) + "] = ");
      vectorB[i] = input.nextInt();
    }
    //-----------------Mostrar Vcctor ----------------//
    System.out.println("Vector A " + Arrays.toString(vectorA));

    System.out.println("Vector B " + Arrays.toString(vectorB));
    //-----------------Producto --------------------//
    int vectorResultado = 0;
    for(int i = 0; i < vectorA.length; i++) {
      vectorResultado += (vectorA[i] * vectorB[i]);
    }
    System.out.println("Resultado: " + vectorResultado);
  }
}
