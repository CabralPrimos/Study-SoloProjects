import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int a, b, soma, sub,multi;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número inteiro: ");
        a = sc.nextInt();
        System.out.println("Digite um número inteiro(Segundo): ");
        b = sc.nextInt();
        soma = a+b;
        sub  = a-b;
        multi = a*b;
        System.out.println("Soma dos valores: "+soma);
        System.out.println("Subtração dos valores: "+sub);
        System.out.println("Multiplicação dos valores: "+multi);
    }
}
