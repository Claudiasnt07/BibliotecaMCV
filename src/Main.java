import controller.GestorBiblioteca;
import model.*;
import view.Consola;

public class Main {

   public static void main(String[] args) {

       GestorBiblioteca gestor = new GestorBiblioteca();

       Libro libro1 = new Libro("1","El Hobbit","Tolkien",Genero.FANTASIA,2);
       Usuario usuario1 = new Usuario(1,"Ana");

       gestor.agregarLibro(libro1);
       gestor.agregarUsuario(usuario1);

       gestor.prestarLibro("1",1);

       Consola.mostrarLibros(gestor.getLibros());
       Consola.mostrarUsuarios(gestor.getUsuarios());
   }
}
