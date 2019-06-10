package Punto_1;

import javax.swing.JOptionPane;

public class Taller_Clase_Demo {
	
	public static void main(String args[]) {
		
		FuncionCuadratica cuadratica = new FuncionCuadratica(1, 2, 3);
		FuncionCubica     cubica     = new FuncionCubica(1,2,3,4);
		
		int opcion = 1;
		
		if (opcion == 1) {
			cuadratica.evaluarFuncion(4);
			cuadratica.derivarFuncion(1);
			cuadratica.integrarFuncion(2, 4);
		}
		
		if(opcion == 2) {
			cubica.evaluarFuncion(3);
			cubica.derivarFuncion(3);
			cubica.integrarFuncion(1, 4);
		}
		
		else JOptionPane.showMessageDialog(null, "Error: Opcion no valida");
		
	}

}
