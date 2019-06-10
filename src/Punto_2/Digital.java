
package Punto_2;


public class Digital extends MaterialLibreria {

   private int duracion;
   private String formato; 
   
   public Digital(String Titulo, int anoPublicacion, int Precio) {
        super(Titulo, anoPublicacion, Precio);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
     
 
  
  
          
}
