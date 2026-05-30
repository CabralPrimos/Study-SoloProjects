import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        double real, tri;

        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um numero real: ");
        real = sc.nextDouble();
        tri = real*3;
        System.out.println("O seu triplo é: "+ tri);
    }
}
