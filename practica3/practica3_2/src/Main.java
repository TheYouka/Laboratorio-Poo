import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a,b,res = 0;

        int operacion;
        Boolean continuar = true;
        String c;
        Calculadora calculadora = new Calculadora();


        System.out.println("Bienvenido a la calculadora potenciada con ia :)");

        while(continuar){

            while(true) {
                try {
                    System.out.println("Ingresa el número de alguna de las siguientes operaciones");
                    System.out.print("1 - Suma\n2- Resta\n3- Multiplicación\n4- División\n5- Exponenciación\n6- Módulo\n: ");
                    operacion = scanner.nextInt();

                    if(operacion < 0 || operacion > 6){
                        System.out.println("Ingresa un número válido, please");
                        continue;
                    }

                    break;
                } catch (Exception e) {
                    System.out.println("Ingresa un número válido, please");
                    scanner.nextLine();
                }
            };

            while(true) {
                try {
                    System.out.print("Ingresa el valor de A\n: ");
                    a = scanner.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Ingresa un valor válido para A, please");
                    scanner.nextLine();
                }
            };

            while(true) {
                try {
                    System.out.print("Ingresa el valor de B\n: ");
                    b = scanner.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Ingresa un valor válido para B, please");
                    scanner.nextLine();
                }
            };

            // Procesar calculo
            switch (operacion){
                case 1:
                    res = calculadora.sumar(a,b);
                    break;
                case 2:
                    res = calculadora.restar(a,b);
                    break;
                case 3:
                    res = calculadora.multiplicar(a,b);
                    break;
                case 4:
                    res = calculadora.dividir(a,b);
                    break;
                case 5:
                    res = calculadora.exponer(a,b);
                    break;
                case 6:
                    res = calculadora.modulo(a,b);
                    break;
            }

            // Imprimir respuesta
            System.out.println(res);

            // Continuar
            while(true){
                System.out.println("Desea continuar?, Y/N");
                scanner.nextLine();
                try {
                    c = scanner.next();
                    if(c.equals("Y") || c.equals("y"))break;
                    else if(c.equals("N") || c.equals("n")){
                        continuar = false;
                        break;
                    }
                    System.out.println("Ingresa Y (yes) o N (no) ");
                }
                catch (Exception e){
                    System.out.println("Ingresa Y (yes) o N (no) ");
                }

            };

        };

        scanner.close();

    }
}