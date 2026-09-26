package mediator;

import colleague.Estudiante;
import model.Libro;

public class BibliotecaMediator implements Mediator {
    @Override
    public void solicitarLibro(Estudiante estudiante, Libro libro) {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("Biblioteca: préstamo aprobado para " + estudiante.getNombre() + ".");
        } else {
            System.out.println("Biblioteca: el libro no está disponible.");
        }
    }

    @Override
    public void devolverLibro(Estudiante estudiante, Libro libro) {
        libro.setDisponible(true);
        System.out.println("Biblioteca: libro disponible nuevamente.");
    }
}
