package calculadora;
/**
 ** @author pablo
 */
import java.util.Scanner;

public class Calculadora {      // Definición de la clase Calculadora con dos variables de instancia num1 y num2
    private double num1, num2;
     // Constructor de la clase, recibe dos números y los guarda en las variables de instancia
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar() {    // Método para sumar los números almacenados en num1 y num2
        return num1 + num2;
    }

    public double restar() {     // Método para restar los números almacenados en num1 y num2
        return num1 - num2;
    }

    public double multiplicar() {  // Método para multiplicar los números almacenados en num1 y num2
        return num1 * num2;
    }

    public double dividir() {     // Método para dividir los números almacenados en num1 y num2
        if (num2 == 0) {           // Si num2 es cero, no se puede realizar la operación y se muestra un mensaje de error     
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        return num1 / num2;
    }

    public double modulo() {     // Método para calcular el módulo de los números almacenados en num1 y num2
        if (num2 == 0) {        // Si num2 es cero, no se puede realizar la operación y se muestra un mensaje de error
            System.out.println("No se puede calcular el módulo por cero");
            return 0;
        }
        return num1 % num2;
    }

    public static void main(String[] args) {     // Método main, punto de entrada del programa
        Scanner sc = new Scanner(System.in);    // Se crea un objeto de tipo Scanner para leer la entrada del usuario

        System.out.println("Bienvenido a la calculadora");   // Se muestra un mensaje de bienvenida al usuario
        boolean seguir = true;    // Se define una variable booleana para controlar si el usuario desea seguir realizando operaciones
        while (seguir) {       // Se inicia un ciclo while para permitir al usuario realizar múltiples operaciones
            System.out.println("Ingrese un número");    // Se pide al usuario que ingrese el primer número
            double num1 = sc.nextDouble();

            System.out.println("Ingrese una operación (+,-,*,/,%)");  // Se pide al usuario que ingrese la operación a realizar
            String operacion = sc.next();

            System.out.println("Ingrese otro número");  // Se pide al usuario que ingrese el segundo número
            double num2 = sc.nextDouble();

            Calculadora calculadora = new Calculadora(num1, num2);              // Se crea un objeto de tipo Calculadora con los números ingresados por el usuario


            switch (operacion) {    // Se utiliza un switch para determinar qué operación debe realizarse y se muestra el resultado
                case "+":
                    System.out.println("El resultado de la suma es: " + calculadora.sumar());
                    break;
                case "-":
                    System.out.println("El resultado de la resta es: " + calculadora.restar());
                    break;
                case "*":
                    System.out.println("El resultado de la multiplicación es: " + calculadora.multiplicar());
                    break;
                case "/":
                    System.out.println("El resultado de la división es: " + calculadora.dividir());
                    break;
                case "%":
                    System.out.println("El resultado del módulo es: " + calculadora.modulo());
                    break;
                default:
                    System.out.println("Operación no válida");
            }

            System.out.println("¿Desea realizar otra operación? (si/no)"); // da la opcion al usuario de continuar o salir
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("no")) {
                seguir = false;
            }
        }

        System.out.println("Gracias por usar la calculadora");  //agradece y se despide
    }
}

 