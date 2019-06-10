
package Punto_2;


public class pelicula extends Digital{
    

    
    private String genero;
    
    
    public pelicula(String Titulo, int anoPublicacion, int Precio) {
        super(Titulo, anoPublicacion, Precio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int obtenerPrecio(){
        return super.getPrecio();
    }
    
    
    }
    
    
