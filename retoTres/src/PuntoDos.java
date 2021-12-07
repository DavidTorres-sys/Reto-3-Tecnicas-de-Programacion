import javax.swing.*;
import java.util.Scanner;

public class PuntoDos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int productoEscalar = 0;
    int i;

    System.out.print("Ingrese el valor de n:");
    i = input.nextInt();

    int [] m = new int [i];
    int [] n = new int [i];

    for(int k = 0; k < i; k++){
      m[k] = (int) (Math.random() * 101);
      n[k] = (int) (Math.random() * 101);
    }
    for(int k = 0; k < i; k++) {
      System.out.println(m[k]);
    }
    for(int k = 0; k < i; k++) {
      System.out.println(n[k]);
    }
    for(int k = 0; k < i; k++) {
      productoEscalar =  productoEscalar + n[k] * m[k];
    }
    System.out.println(productoEscalar);
  }
}
