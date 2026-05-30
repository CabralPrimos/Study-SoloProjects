import java.util.Scanner;

public class atribuicao {
    public static void main(String []args){
        int depen;
        String Nome, Cargo;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        Nome = sc.next();
        System.out.print("Digite a quantidade de dependentes: ");
        depen = sc.nextInt();
        System.out.print("Digite seu cargo: ");
        Cargo = sc.next();
        
        System.out.println("Nome : " + Nome);
        System.out.println("Dependentes: " + depen);
        System.out.println("Cargo: " + Cargo);
    }
    
}