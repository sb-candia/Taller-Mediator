package main;

import colleague.Estudiante;
import mediator.BibliotecaMediator;
import mediator.Mediator;
import model.Libro;

public class Main {
    public static void main(String[] args) {
        Mediator biblioteca = new BibliotecaMediator();
        
        Libro libro = new Libro("Patrones de Diseño");
        
        Estudiante ana = new Estudiante("Ana", biblioteca);
        Estudiante carlos = new Estudiante("Carlos", biblioteca);
        
        ana.pedir(libro);
        carlos.pedir(libro);
        
        ana.devolver(libro);
        
        carlos.pedir(libro);
    }
}
