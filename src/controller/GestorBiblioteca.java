package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamos> prestamos;

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
}
