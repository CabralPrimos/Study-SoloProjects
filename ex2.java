import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
        int um,dois,tre; 
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        um = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        dois = sc.nextInt();
        tre = um + dois;

        System.out.println("A soma dos valores é: "+ tre);

    }

}