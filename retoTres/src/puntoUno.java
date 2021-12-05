import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;

public class puntoUno {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);

    //----------- Punto Uno -------------//

    int nArray = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas a subir"));
    float [] nota = new float [nArray];

    System.out.println("Ingrese la(s) nota(s):");
    for(int i = 0 ;i < nArray; i++) {
      System.out.print((i + 1) + ". notas:");
      nota [i] = input.nextFloat();
    }
    System.out.println(Arrays.toString(nota));
  }
}

