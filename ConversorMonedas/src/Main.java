import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moneda moneda;
        int opcion = 0;
        Double cantidad = 0.0;
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        while (opcion != 7){
            System.out.println("Bienvenido al conversor de monedas".toUpperCase());
            System.out.println("Ingrese el numero de opcion que desea");
            System.out.println("""
                    1. Covertir Peso Argentino (ARS) a Dolar Estadounidense (USD)
                    2. Convertir Dolar Estadounidense (USD) a Peso Argentino (ARS)
                    3. Convertir Peso Mexicano (MXN) a Peso Argentino (ARS)
                    4. Convertir Peso Argentino (ARS) a Peso Mexicano (MXN)
                    5. Convertir Euro (EUR) a Peso Argentino (ARS)
                    6. Convertir Peso Argentino (ARS) a Euro (EUR)
                    7. SALIR
                    """);
            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion){
                    case 1:
                        System.out.println("Ingrese cantidad a convertir (ARS)");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        moneda = consultaMoneda.buscarMoneda("ARS", "USD", cantidad);
                        System.out.println(cantidad+" ARS"+ " es igual a "+ moneda.conversion_result()+" USD" );
                        break;
                    case 2:
                        System.out.println("Ingrese cantidad a convertir (USD)");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        moneda = consultaMoneda.buscarMoneda("USD", "ARS", cantidad);
                        System.out.println(cantidad+" USD"+ " es igual a "+ moneda.conversion_result()+" ARS" );
                        break;
                    case 3:
                        System.out.println("Ingrese cantidad a convertir (MXN)");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        moneda = consultaMoneda.buscarMoneda("MXN", "ARS", cantidad);
                        System.out.println(cantidad+" MXN"+ " es igual a "+ moneda.conversion_result()+" ARS" );
                        break;
                    case 4:
                        System.out.println("Ingrese cantidad a convertir (ARS)");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        moneda = consultaMoneda.buscarMoneda("ARS", "MXN", cantidad);
                        System.out.println(cantidad+" ARS"+ " es igual a "+ moneda.conversion_result()+" MXN" );
                        break;
                    case 5:
                        System.out.println("Ingrese cantidad a convertir (EUR)");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        moneda = consultaMoneda.buscarMoneda("EUR", "ARS", cantidad);
                        System.out.println(cantidad+" EUR"+ " es igual a "+ moneda.conversion_result()+" ARS" );
                        break;
                    case 6:
                        System.out.println("Ingrese cantidad a convertir (ARS)");
                        cantidad = Double.parseDouble(scanner.nextLine());
                        moneda = consultaMoneda.buscarMoneda("ARS", "EUR", cantidad);
                        System.out.println(cantidad+" ARS"+ " es igual a "+ moneda.conversion_result()+" EUR" );
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }catch (NumberFormatException e){
                System.out.println("Error: "+e);
            }
        }
    }
}