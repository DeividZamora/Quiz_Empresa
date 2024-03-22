package Quiz;

import java.util.Scanner;

public class Empleado extends Persona {

	String salario;
	String cargo;
	
	public Empleado(String nombre, int edad,String salario, String cargo) 
	{
		super(nombre, edad);
		this.salario=salario;
		this.cargo=cargo;
		
	}

	//metodo mostrar informacion()
	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", cargo=" + cargo + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	
	
	
}
