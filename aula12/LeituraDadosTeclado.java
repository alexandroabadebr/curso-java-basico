import java.util.Scanner;

class LeituraDadosTeclado {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    /*
    System.out.print("Digite seu nome completo: ");
    String nomeCompleto = scan.nextLine();
    System.out.println("Seu nome completo é: " + nomeCompleto);
    
    System.out.print("Digite seu nome primeiro nome: ");
    String primeiroNome = scan.nextLine();
    System.out.println("Seu primeiro nome é: " + primeiroNome);
    */

    System.out.print("Digite a sua idade: ");
    int idade = scan.nextInt();
    System.out.println("Sua idade é: " + idade);

    System.out.print("Digite a sua altura: ");
    double altura = scan.nextDouble();
    System.out.println("A sua altura é: " + altura);
  }
}
