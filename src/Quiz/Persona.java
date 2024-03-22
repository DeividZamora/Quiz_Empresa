package Quiz;

import java.util.Scanner;

public class Persona 

{
protected String nombre;
protected int edad;

public Persona(String nombre, int edad) {
	this.nombre = nombre;
	this.edad = edad;
}

//metodo mostrar informacion()
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
}


public void responderPreguntas()
{
	Scanner leer = new Scanner(System.in);
	System.out.println("1. ¿Cuál es la diferencia entre una clase `Persona` y una clase `Empleado` en términos de atributos y métodos?"); 
	leer.next();
	System.out.println("2. ¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
	leer.next();
    System.out.println("3. ¿Qué es un constructor en Java y cuál es su propósito?"); 
    leer.next();
    System.out.println("4. ¿Por qué es útil utilizar la herencia en la programación orientada a objetos?"); 
    leer.next();
    System.out.println("5. ¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?"); 
	leer.close();
}

	
	

}
