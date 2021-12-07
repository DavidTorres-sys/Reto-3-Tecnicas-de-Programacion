import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;

public class PuntoUno {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    float sumaNotas = 0;
    float promedioNotas;
    float notaMayor = 0;
    //-------------- Pregunta Array ----------//
    int nArray = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas a subir"));
    float [] nota = new float [nArray];

    System.out.println("Ingrese la(s) nota(s)");
    for(int k = 0; k < nArray; k++) {
      if (nota[k] <= 5) {
        for (int i = 0; i < nArray; i++) {
          System.out.print((i + 1) + ". nota:");
          nota[i] = input.nextFloat();
        }
      }
      else {
        System.out.println("Error!");
        break;
      }
    }
    System.out.println("Notas: " + Arrays.toString(nota));



    //-------------- Mayor nota -------------------------//
    for(int x = 0; x < nArray; x++) {
      if (nota[x] > notaMayor) {
        notaMayor = nota[x];
      }
    }
    System.out.println("La mayor nota es: " + notaMayor);

    //------------ Menor nota ------------------------//
    float notaMenor = nota[0];
    for(int x = 0; x < nArray; x++) {
      if (nota[x] < notaMenor) {
        notaMenor = nota[x];
      }
    }
    System.out.println("La menor nota es: " + notaMenor);

    //------------ Promedio notas -----------------------//
    for(int k = 0; k < nArray; k++) {
      sumaNotas += nota[k];
    }
    promedioNotas = sumaNotas / nArray;
    System.out.println("Promedio Notas: " + promedioNotas);
    if(promedioNotas >= 3){
      System.out.println("Aprobó la materia");
    }
    else {
      System.out.println("Reprobó la materia ");
    }
  }
}

