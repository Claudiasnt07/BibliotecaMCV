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

    public static void mostrarUsuarios(List<Usuario> usuarios) {
        System.out.println("USUARIOS");

        for (Usuario u : usuarios) {
            System.out.println(u.getNombre());

            for (Prestamo p : u.getPrestamos()) {
                System.out.println(" Libro: " + p.getLibro().getTitulo());
            }
        }
    }
}
