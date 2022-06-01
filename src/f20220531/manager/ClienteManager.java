package f20220531.manager;

import f20220531.Cliente;

import java.util.List;

public class ClienteManager {

    // Funcion que permite recorrer el arreglo e imprimir
    public void recorrerArregloCliente(List<Cliente> listaClientes) {
        for (Cliente cliente:listaClientes){
            System.out.println(cliente.toString());
        }
    }
}
