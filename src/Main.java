import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int opcion, operacion;
        double V, R, I, tarea = 0, quiz = 0, parcial = 0, corte1, corte2, corte3, total;
        System.out.println("----Menu----");
        System.out.println("1)Calcular V,R,i (ley de ohm)");
        System.out.println("2)Calcular nota definitiva");
        System.out.println("Escoja una opcion:");
        opcion = scanner.nextInt();
        if (opcion == 1) {
            System.out.println("Que desea calcular? (voltaje '1', corriente '2', resistencia '3'  )");
            operacion = scanner.nextInt();
            if (operacion == 1) {
                System.out.println("Ingrese el valor de la intensidad y la resistencia");
                System.out.println("Intensidad:");
                R = scanner.nextDouble();
                System.out.println("Resistencia");
                I = scanner.nextDouble();
                V = I * R;
                System.out.println("El voltaje es: " + V + " Voltios");
            } else if (operacion == 2) {
                System.out.println("Ingrese el valor del voltaje y la resistencia");
                System.out.println("Voltaje:");
                V = scanner.nextDouble();
                System.out.println("Resistencia");
                R = scanner.nextDouble();
                I = V / R;
                System.out.println("La corriente es: " + I + " Amperios");
            } else if (operacion == 3) {
                System.out.println("Ingrese el valor del voltaje y la intensidad");
                System.out.println("Voltaje:");
                V = scanner.nextDouble();
                System.out.println("Intensidad");
                I = scanner.nextDouble();
                R = V / I;
                System.out.println("El voltaje es: " + R + " Ohmios");
            }
        } else if (opcion == 2) {
            System.out.println("Ingrese las notas del primer corte: ");
            System.out.println("Tarea");
            tarea = scanner.nextDouble();
            tarea = tarea * 0.10;
            System.out.println("Quiz");
            quiz = scanner.nextDouble();
            quiz = quiz * 0.10;
            System.out.println("Parcial");
            parcial = scanner.nextDouble();
            parcial = parcial * 0.10;
            corte1 = (tarea + quiz + parcial) * 0.35;
            System.out.println("El total del corte es: " + df.format(corte1));
            System.out.println("Ingrese las notas del segundo corte: ");
            System.out.println("Tarea");
            tarea = scanner.nextDouble();
            tarea = tarea * 0.10;
            System.out.println("Quiz");
            quiz = scanner.nextDouble();
            quiz = quiz * 0.10;
            System.out.println("Parcial");
            parcial = scanner.nextDouble();
            parcial = parcial * 0.10;
            corte2 = (tarea + quiz + parcial) * 0.35;
            System.out.println("El total del corte es: " + df.format(corte2));
            System.out.println("Ingrese las notas del tercer corte: ");
            System.out.println("Tarea");
            tarea = scanner.nextDouble();
            tarea = tarea * 0.10;
            System.out.println("Quiz");
            quiz = scanner.nextDouble();
            quiz = quiz * 0.10;
            System.out.println("Parcial");
            parcial = scanner.nextDouble();
            parcial = parcial * 0.10;
            corte3 = (tarea + quiz + parcial) * 0.35;
            System.out.println("El total del corte es: " + df.format(corte3));
            total = (corte1+corte2+corte3);
            System.out.println("total del corte: "+total);
        }
    }
}