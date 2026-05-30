import java.util.Scanner;

public class ex3 {
    public static void main(String[]args){
    int a,b,c,d,total,a1,a2;

    Scanner sc = new Scanner (System.in);
    System.out.print("Digite o lado maior do Primeiro retangulo: ");
    a = sc.nextInt();
    System.out.print("Digite o lado menor do Primeiro retangulo: ");
    b = sc.nextInt();
    a1 = a*b;

    System.out.print("Digite o lado maior do Segundo retangulo: ");
    c = sc.nextInt();
    System.out.print("Digite o lado menor do Segundo retangulo: ");
    d = sc.nextInt();
    a2 = c*d;
    
    total = a1+a2;
    System.out.println("Área total dos retangulos: " + total);
    System.out.println("Área do primeiro retangulo: " + a1);
     System.out.println("Área do segundo retangulo: " + a2);
    }
}
