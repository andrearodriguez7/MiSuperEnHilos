
public class Supermercado {
    public static void main(String[] args) {
        // Crear los productos para cada cliente
        String[][] productosClientes = {
                {"Leche de avellanas", "Pan", "Queso vegano", "Heura", "Tofu"},
                {"Arroz", "Guisantes", "Aceite"},
                {"Macarrones", "Calabaza"},
                {"Calabacin", "Cerveza", "Vino", "Chocolate", "Galletas Oreo"},
                {"Helado", "Tomates", "Aceite", "Ajo"}
        };

        // Crear los clientes
        Cliente cliente1 = new Cliente("Cliente 1", productosClientes[0]);
        Cliente cliente2 = new Cliente("Cliente 2", productosClientes[1]);
        Cliente cliente3 = new Cliente("Cliente 3", productosClientes[2]);
        Cliente cliente4 = new Cliente("Cliente 4", productosClientes[3]);
        Cliente cliente5 = new Cliente("Cliente 5", productosClientes[4]);

        // Creamos las dos cajas que tenemos
        Caja caja1 = new Caja("Caja 1");
        Caja caja2 = new Caja("Caja 2");

        // Iniciamos hilos de clientes en las cajas
        new Thread(() -> caja1.atenderCliente(cliente1)).start();
        new Thread(() -> caja1.atenderCliente(cliente2)).start();
        new Thread(() -> caja2.atenderCliente(cliente3)).start();
        new Thread(() -> caja2.atenderCliente(cliente4)).start();
        new Thread(() -> caja2.atenderCliente(cliente5)).start();
    }
}
