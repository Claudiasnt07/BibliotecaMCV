package controller;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class GestorBiblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public GestorBiblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void prestarLibro(String isbn, int idUsuario) {
        Libro libro = buscarLibroPorISBN(isbn);
        Usuario usuario = null;

        for (Usuario u : usuarios) {
            if (u.getId() == idUsuario) {
                usuario = u;
            }
        }

        if (libro == null || usuario == null) {
            throw new RuntimeException("Libro o usuario no encontrado");
        }

        if (!libro.disponible()) {
            throw new RuntimeException("Libro no disponible");
        }

        Prestamo p = new Prestamo(libro, usuario);

        libro.prestar();
        usuario.agregarPrestamo(p);

        prestamos.add(p);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
