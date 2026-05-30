import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        int hora, min, tmin;

        Scanner sc = new Scanner (System.in);
        System.out.println("Digite as horas do dia, nesse momento em que digita: ");
        hora = sc.nextInt();
        System.out.println("Digite os minutos do dia, nesse momento em que digita: ");
        min = sc.nextInt();
        tmin = min + (hora*60);
        System.out.println("Minutos passados :" + tmin);

    }
}
