import java.util.Scanner;

public class exercise5 {
  // Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
  // N * (N-1) * (N-2) * (N-3) * ... * 1.Lembrando que, por definição, fatorial de
  // 0 é 1.

  public static void main(String[] args) {
    System.out.println("insira seu número");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if (number < 0) {
      System.out.println(
          "Não é possivel calcular o fatorial de um número negativo");
    }
    
    if (number == 0 || number == 1) {
      System.out.println(number + "! = " + 1);
    }

    if (number > 1) {
      int result = 1;
      for (int i = 2; i <= number; i++) {
        result *= i;
      }
      System.out.println(number + "! = " + result);
    }
  }
}
