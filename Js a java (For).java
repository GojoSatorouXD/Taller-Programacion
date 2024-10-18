import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadPersonas = 2;
        int contadorPersonas = 0;
        double acumuladorEdad = 0;
        double acumuladorEstatura = 0;

        for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
            System.out.print("Ingrese la edad de la persona " + numeroPersona + ": ");
            double edad = scanner.nextDouble();

            System.out.print("Ingrese el estado civil de la persona " + numeroPersona + " (1. Soltero, 2. Casado): ");
            int estadoCivil = scanner.nextInt();

            System.out.print("Ingrese la altura de la persona " + numeroPersona + " en cm: ");
            double estatura = scanner.nextDouble();

            System.out.print("Ingrese el sexo de la persona " + numeroPersona + " (1. Hombre, 2. Mujer): ");
            int sexo = scanner.nextInt();

            if (edad > 18 && estadoCivil == 1 && estatura > 170 && sexo == 1) {
                contadorPersonas++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
            }
        }

        double promedioEdad = contadorPersonas > 0 ? acumuladorEdad / contadorPersonas : 0;
        double promedioEstatura = contadorPersonas > 0 ? acumuladorEstatura / contadorPersonas : 0;
        double porcentajePersonas = (contadorPersonas / (double) cantidadPersonas) * 100;

        System.out.println("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años");
        System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " centímetros");
        System.out.printf("El porcentaje de las personas que cumplen con la condición es del: %.2f %%\n", porcentajePersonas);

        scanner.close();
    }
}
