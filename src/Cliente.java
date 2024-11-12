public class Cliente {
        private String nombre;
        private String[] productos;

        public Cliente(String nombre, String[] productos) {
            this.nombre = nombre;
            this.productos = productos;
        }

        public String getNombre() {
            return nombre;
        }

        public String[] getProductos() {
            return productos;
        }
    }


