package model;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private Genero genero;

    private int copiasTotales;
    private int copiasDisponibles;

    private EstadoLibro estado;

    public Libro(String isbn, String titulo, String autor, Genero genero, int copias) {
        this.isbn =  isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;

        this.copiasTotales = copias;
        this.copiasDisponibles = copias;

        estado = EstadoLibro.DISPONIBLE;
    }

    public boolean disponible() {
        return copiasDisponibles > 0;
    }

    public void prestar() {
        copiasDisponibles--;
        estado = EstadoLibro.PRESTADO;
    }
}
