/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto_2;

/**
 *
 * @author EstudianteUnivalle
 */
public class Libro extends Impreso{
    protected String editorial;
    protected String enfasis;

    public Libro(String Titulo, int anoPublicacion, int Precio) {
        super(Titulo, anoPublicacion, Precio);
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(String enfasis) {
        this.enfasis = enfasis;
    }
    
    public double obtenerIVA(){
        return 0.16;
    }
    
    
    public int obtenerPrecio(){
        return super.getPrecio();
    }
    
    
    
    
    
}
