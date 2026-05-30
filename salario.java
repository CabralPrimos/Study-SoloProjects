import java.util.Scanner;
public class salario {
public static void main(String[] args) {
    String nome;
    double sal;
    int vendas;

    Scanner leia = new Scanner(System.in);

    System.out.println("Entre os dados para o calculo de Salário");
    System.out.println("------------");
    System.out.println("Digite nome: ");
    nome = leia.next();
    System.out.println("Digite Salário: ");
    sal = leia.nextDouble();
    System.out.println("Digite o total de vendas feitas no mês ");
    vendas = leia.nextInt();

    


    }
}
