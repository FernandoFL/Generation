package f20220531;

import f20220531.manager.ClienteManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Intanciar a la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Arreglo Clientes
        List<Cliente> listaClientes = new ArrayList<Cliente>();

        // Instanciar a la clase Cliente
        Cliente cliente = new Cliente();

        // Ingreso de valores estaticos
        cliente.setId(1234);
        cliente.setNombre("Fernando");
        cliente.setRut("12345678-9");

        int opcion;

        do {
            // Excepciones
            Cliente clienteDatosDinamicos = new Cliente();

            // El try-catch  nos sirve para el manejo de excepciones o errores, para evaluar o capturar los errores deben estar dentro del try
            try {

                // Solicitud Nombre
                System.out.println("Favor ingresar su nombre");
                String nombre = sc.nextLine();
                clienteDatosDinamicos.setNombre(nombre);

                //Solicitud Rut
                System.out.println("Favor ingresar rut");
                String rut = sc.nextLine();
                clienteDatosDinamicos.setRut(rut);

                // Solicitud Correo
                System.out.println("Favor ingresar su correo");
                String correo = sc.nextLine();
                clienteDatosDinamicos.setCorreo(correo);

                // Solicitud Id
                System.out.println("Favor ingresar el Id de cliente");
                //Integer id = sc.nextInt();
                clienteDatosDinamicos.setId(sc.nextInt());

               /* Integer division = 100 / 0;
                System.out.println(division); */
            } catch (ArithmeticException ae) {
                System.out.println("Error al dividir por cero");
            } catch (NullPointerException npe) {
                System.out.println("No se puede realizar la operación matematica, uno o más datos son nulos");
            } catch (InputMismatchException ime) {
                System.out.println("Error en el ingreso de uno o más datos");
            } catch (NumberFormatException nfe) {
                System.out.println("No puede ingresar una letra como identificador." + nfe);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error, contacte al administrador " + e);
            }
            // Agregar el cliente a la lista
            listaClientes.add(clienteDatosDinamicos);

            // Validacion de el valor ingresado si es distinto volvera a preguntar
            do {
                System.out.println("Desea ingresar un nuevo cliente? (1) Si (0) No");
                opcion = sc.nextInt();
            } while (opcion < 0 || opcion > 1);

            sc.nextLine();

        } while (opcion == 1);

        /**acceder al metodo de otra clase**/
        //instancia de la clase

        ClienteManager cm = new ClienteManager();
        cm.recorrerArregloCliente(listaClientes);

    }
}
