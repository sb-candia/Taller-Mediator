package colleague;

import mediator.Mediator;
import model.Libro;

public class Estudiante {
    private String nombre;
    private Mediator mediador;

    public Estudiante(String nombre, Mediator mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public String getNombre() {
        return nombre;
    }

    public void pedir(Libro libro) {
        System.out.println(nombre + " solicita el libro \"" + libro.getNombre() + "\".");
        mediador.solicitarLibro(this, libro);
    }

    public void devolver(Libro libro) {
        System.out.println(nombre + " devuelve el libro \"" + libro.getNombre() + "\".");
        mediador.devolverLibro(this, libro);
    }
}
