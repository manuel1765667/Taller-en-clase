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
public class Revista extends Impreso{
    protected String tipo;

    public Revista(String Titulo, int anoPublicacion, int Precio) {
        super(Titulo, anoPublicacion, Precio);
    }

    public double obtenerIVA(){
        return 0.16;
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
