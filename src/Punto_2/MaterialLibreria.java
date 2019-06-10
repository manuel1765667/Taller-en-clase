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
public class MaterialLibreria {
    protected String Titulo;
    protected int anoPublicacion;
    private int precio;
    
    public MaterialLibreria(String Titulo, int anoPublicacion, int Precio){
        this.Titulo = Titulo;
        this.anoPublicacion = anoPublicacion;
        this.precio = Precio;
    };

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
