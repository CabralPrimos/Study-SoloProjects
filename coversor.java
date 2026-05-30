import java.util.Scanner;
public class coversor {

public static void main(String[] args) {
    double real,dolar,euro;

    Scanner leia = new Scanner(System.in);
    System.out.println("Digite o Valor em reais para fazer a coversão em Dólar/Euro");
    real = leia.nextDouble();
    dolar = 5.24;
    euro = 6.08;
    System.out.println("Cotação Dólar: " + dolar + " ; " + "Cotação Euro: " + euro);
    System.out.println("Data dos Valores conferidos : 08/03/2026");
    System.out.println("Valor recebido em Dolár : "+ (real*dolar));
    System.out.println("Valor recebido em Euro : "+ (real*euro));

    leia.close();

}
}