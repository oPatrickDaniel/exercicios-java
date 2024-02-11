import java.util.Scanner;

public class exercise1 {
  // Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de
  // até X, um valor por linha, inclusive o X, se for o caso.
  public static void main(String[] args) {
    System.out.println("Digite um número");
    Scanner sc = new Scanner(System.in);
    int numberX = sc.nextInt();

    System.out.println("Os números impares entre 1 e " + numberX + " são:");
    for (int i = 0; i <= numberX; i++) {
      boolean isOdd = i % 2 != 0;
      if (isOdd) {
        System.out.print(i + " ");
      }
    }
  }
}