import java.util.Scanner;

public class exercise4 {
  // Fazer um programa para ler um número N. Depois leia N pares de números e
  // mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
  // mostrar a mensagem "divisao impossivel".
  public static void main(String[] args) {
    System.out.println("insira quantos pares de números serão divididos");
    Scanner sc = new Scanner(System.in);
    int nPairs = sc.nextInt();

    for (int i = 0; i < nPairs; i++) {
      int value1 = sc.nextInt();
      int value2 = sc.nextInt();

      boolean value2IsZero = value2 == 0;
      if (value2IsZero) {
        System.out.println("divisao impossivel");
      }

      if (!value2IsZero) {
        double division = (double) value1 / value2;
        System.out.printf("%.2f%n", division);
      }
    }
  }
}
