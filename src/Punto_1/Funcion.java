package Punto_1;
import javax.swing.JOptionPane;
public class Funcion {

	public Funcion() {
		
	}
	
	public void evaluarFuncion(double x) {
		JOptionPane.showMessageDialog(null, "\nSe esta evaluando la funcion en: " + x);
		
	}
	
	public void derivarFuncion(double x) {
		JOptionPane.showMessageDialog(null, "\nSe esta derivando la funcion: " + x);
	}
	
	public void integrarFuncion(double a, double b) {
		JOptionPane.showMessageDialog(null, "\nSe esta integrando la funcion desde: " + a +" hasta "+b );
		
	}
	
}
