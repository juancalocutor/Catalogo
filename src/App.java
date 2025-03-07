
import org.juancalocutor.catalogo.clases.*;
import org.juancalocutor.catalogo.interfaces.*;

public class App {
    public static void main(String[] args) throws Exception {

        IProducto[] productos = new IProducto[4];

        productos[0] = new Iphone(4562, "Aple", "iphone 11", "Blanco");
        productos[1] = new TvLcd(78956, "Sony", 55);
        productos[2] = new Libro(34000, "Crimen y castigo", "Fiodor Dostoiesky", "Planeta", 2024);
        productos[3] = new Comics(43000, "Las aventuras de Thor", "Loki", "Planeta", 2023, "Thor");

        for (IProducto iProducto : productos) {
            System.out.println("El producto \"" + iProducto.getClass().getSimpleName() + "\" - con precio: "
                    + iProducto.getPrecioProducto());

            if (iProducto instanceof IElectronico) {
                System.out.println(" - fabricante " + ((IElectronico) iProducto).getFabricante());
                if (iProducto instanceof Iphone) {
                    System.out.println(" - Modelo " + ((Iphone) iProducto).getModelo() + " - Color "
                            + ((Iphone) iProducto).getColor());
                }
                if (iProducto instanceof TvLcd) {
                    System.out.println(" - pulgadas " + ((TvLcd) iProducto).getPulgadas());
                }
            }

            if (iProducto instanceof Libro) {
                System.out.println(
                        " - Titulo " + ((Libro) iProducto).getTitulo() + " Autoria de " + ((Libro) iProducto).getAutor()
                                + " - de la editorial " + ((Libro) iProducto).getEditorial() + "\n - publicado en "
                                + ((Libro) iProducto).getFechaPublicacion());
                if (iProducto instanceof Comics) {
                    System.out.println(" - personaje principal " + ((Comics) iProducto).getPersonaje());
                }
            }

            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("   ".repeat(5 - i));
            System.out.println("*".repeat(2 * i + 1));
        }
        System.out.println("GuayuribaDev =====(|| ");
        for (int i = 5; i > 0; i--) {
            System.out.print("   ".repeat(5 - i + 1));
            System.out.println("*".repeat(2 * i - 1));
        }
        System.out.println();

    }
}
