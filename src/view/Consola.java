package view;

import model.*;

import java.util.List;

public class Consola {
    public static void mostrarLibros(List<Libro> libros) {
        System.out.println("LIBROS");

        for (Libro l : libros) {
            System.out.println(l);
        }
    }
}
