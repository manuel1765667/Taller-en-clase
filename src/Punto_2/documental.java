
package Punto_2;




public class documental extends Digital{
    
    private String tipo;
    
   public documental(String Titulo, int anoPublicacion, int Precio) {
        super(Titulo, anoPublicacion, Precio);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int obtenerPrecio(){
       return super.getPrecio();
    }
    
    
    }
    
   
    
    
    
    
    
    

