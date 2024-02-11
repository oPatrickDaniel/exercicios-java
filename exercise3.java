import java.util.Scanner;

public class exercise3 {
  // Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
  // seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com
  // uma casa decimal. Apresente a média ponderada para cada um destes conjuntos
  // de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso
  // 3 e o terceiro valor tem peso 5.
  public static void main(String[] args) {
    // Media ponderada = Soma dos pesos * Soma dos produtos / pesos​
    System.out.println("Quantos casos de teste você deseja?");
    Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt();

    System.out.println("insira 3 valores para calcular a média ponderada");
    for (int i = 1; i <= testCases; i++) {
      double value1 = sc.nextDouble();
      double value2 = sc.nextDouble();
      double value3 = sc.nextDouble();

      int weight1 = 2;
      int weight2 = 3;
      int weight3 = 5;

      double weightedAverage = ((value1 * weight1) + (value2 * weight2) +
          (value3 * weight3)) / (weight1 + weight2 + weight3);

      System.out.printf("A media ponderada do caso " + i + " é: " +
          "%.2f", weightedAverage);

    }
  }
}
