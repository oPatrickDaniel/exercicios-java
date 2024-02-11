import java.util.Scanner;

public class exercise6 {
  // Ler um número inteiro N e calcular todos os seus divisores.
  public static void main(String[] args) {
    System.out.println("insira seu número");
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();

    System.out.println("Os divisores de " + number + " são:");
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
