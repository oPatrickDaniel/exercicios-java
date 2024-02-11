import java.util.Scanner;

public class exercise2 {
  // Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
  // que serão lidos em seguida.
  // Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
  // estão fora do intervalo, mostrando
  // essas informações conforme exemplo (use a palavra "in" para dentro do
  // intervalo, e "out" para fora do intervalo).

  public static void main(String[] args) {

    System.out.println("Digite quantos números você deseja testar");
    Scanner sc = new Scanner(System.in);
    int numberN = sc.nextInt();
    int numersIn = 0;
    int numbersOut = 0;

    System.out.println("digite " + numberN + " números");
    for (int i = 0; i < numberN; i++) {
      int currentNum = sc.nextInt();

      Boolean inRangeTenToTwenty = currentNum >= 10 && currentNum <= 20;
      if (inRangeTenToTwenty) {
        numersIn += 1;
      }
      if (!inRangeTenToTwenty) {
        numbersOut += 1;
      }
    }
    System.out.println("Dos " + numberN + " número(s) digitados, " + numersIn +
        " esta(ão) entre 10 e 20 " + "e " + numbersOut + " não esta(ão)");
  }
}