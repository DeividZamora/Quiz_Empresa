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
	System.out.println("RTA/ La clase empleado hereda los atributos de persona, asi que su diferencia radica en el numero de atributos, lo mismo en cuanto a metodos. ");
	System.out.println("2. ¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
	System.out.println("RTA/ Se crea la clase empleado y luego se escribe extends, ademas agregamos un costructor para que funcione ");
    System.out.println("3. ¿Qué es un constructor en Java y cuál es su propósito?"); 
    System.out.println("RTA/ El objetivo del costructor es poner valores por defecto a un objeto cuando es creado");
    System.out.println("4. ¿Por qué es útil utilizar la herencia en la programación orientada a objetos?"); 
    System.out.println("RTA/ Para reducir codigo y hacer mas simple el programa");
    System.out.println("5. ¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?"); 
    System.out.println("Se llama instanciar");
	leer.close();
}

}
