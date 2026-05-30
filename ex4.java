import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double dol,real;

        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor em dolares: ");
        dol = sc.nextInt();
        real = dol*5.43;
        System.out.println("Esse valor em reais é: " + real);
        System.out.println("Valor usado para coversão, dolar = 5.43 para 1 real");
        
    }
}
