package model;

public class Libro {
    private String nombre;
    private boolean disponible;

    public Libro(String nombre) {
        this.nombre = nombre;
        this.disponible = true;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
