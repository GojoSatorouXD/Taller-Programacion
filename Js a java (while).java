import java.util.Scanner;

class Calculadora {
    public Calculadora() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número que desea calcular: ");
        int numeroEntrada = scanner.nextInt();
        int resultado = 0;
        int control = 0;
        
        while (numeroEntrada >= control) {
            resultado += control;
            control++;
        }
        
        System.out.println("La suma de los primeros " + numeroEntrada + " naturales es igual a " + resultado);
        
        scanner.close();
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}