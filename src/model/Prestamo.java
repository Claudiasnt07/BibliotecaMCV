package model;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;

    private LocalDate fechaPrestamo;
    private LocalDate fechaVencimiento;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;

        fechaPrestamo = LocalDate.now();
        fechaVencimiento = fechaPrestamo.plusDays(30);
    }

    public Libro getLibro() { return libro; }
    public Usuario getUsuario() { return usuario; }
}
