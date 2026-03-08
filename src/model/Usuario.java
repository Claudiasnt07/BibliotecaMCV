package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

   private int id;
   private String nombre;

   private List<Prestamo> prestamos;

   public Usuario(int id, String nombre) {

       this.id = id;
       this.nombre = nombre;

       prestamos = new ArrayList<>();
   }

   public void agregarPrestamo(Prestamo p) {

       if (prestamos.size() >= 3) {
           throw new RuntimeException("No puede tener más de 3 libros.");
       }

       prestamos.add(p);
   }

   public void devolverPrestamo(Prestamo p) {
       prestamos.remove(p);
   }

   public int getId() { return id; }

   public String getNombre() { return nombre; }

   public List<Prestamo> getPrestamos() { return prestamos; }

}
