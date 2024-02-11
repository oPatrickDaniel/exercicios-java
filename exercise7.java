import java.util.Scanner;

public class exercise7 {
  // Fazer um programa para ler um número inteiro positivo N. O programa deve
  // então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
  // mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
  // exemplo.
  public static void main(String[] args) {
    System.out.println("Insira seu número");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    System.out.println("Resultado:");
    for (int i = 1; i <= number; i++) {
      int iSquared = i * i;
      int iCubed = i * i * i;

      System.out.printf("%d %d %d%n", i, iSquared, iCubed);
    }
  }
}
