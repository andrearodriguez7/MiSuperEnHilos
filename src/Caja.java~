public class Caja {
    private String nombreCaja;
    private long initialTime;

    public Caja(String nombreCaja) {
        this.nombreCaja = nombreCaja;
    }

    // Método para procesar a un cliente
    public void atenderCliente(Cliente cliente) {
        this.initialTime = System.currentTimeMillis();

        // Recorrer todos los productos del cliente
        for (String producto : cliente.getProductos()) {
            procesarProducto(cliente, producto);
        }

        long totalTime = System.currentTimeMillis() - initialTime;
        System.out.println(cliente.getNombre() + " ha terminado de pagar en " + nombreCaja);
        System.out.println("Tiempo total de " + cliente.getNombre() + " en " + nombreCaja + ": " + totalTime + " ms");
    }

    // Método para poder procesar cada producto de todos los clientes
    private void procesarProducto(Cliente cliente, String producto) {
        long startTime = System.currentTimeMillis();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long processingTime = endTime - startTime;

        // Mostramos el tiempo que ha tardado
        System.out.println(cliente.getNombre() + " está procesando el producto " + producto +
                " en " + nombreCaja + ". Tiempo de procesamiento: " + processingTime + " ms");
    }
}

