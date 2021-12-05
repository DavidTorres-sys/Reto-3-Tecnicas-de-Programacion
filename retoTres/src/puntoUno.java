import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;

public class puntoUno {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);

    float  sumaNotas = 0;
    float  promedioNotas = 0;
    int nArray = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas a subir"));
    float [] nota = new float [nArray];

    System.out.println("Ingrese la(s) nota(s):");
    for(int i = 0 ;i < nArray; i++) {
      System.out.print((i + 1) + ". nota:");
      nota [i] = input.nextFloat();
    }
    System.out.println("Notas: " + Arrays.toString(nota));

    for(int k = 0; k < nArray; k++){
      sumaNotas += nota[k];
    }
    System.out.println("Suma notas: " + sumaNotas);

    promedioNotas = sumaNotas / nArray;
    System.out.println("Promedio Notas: " + promedioNotas);
  }
}

