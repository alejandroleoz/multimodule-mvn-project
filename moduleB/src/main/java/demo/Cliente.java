package demo;

public class Cliente extends Usuario {
    private String categoria;

    public Cliente(String nombre, String categoria) {
        super(nombre);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s | Categoria: %s \n", getNombre(), categoria);
    }
}
