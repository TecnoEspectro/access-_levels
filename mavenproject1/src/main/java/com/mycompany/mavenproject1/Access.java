
package com.mycompany.mavenproject1;
import people.Persona;
//Niveles de acceso en clases: default y publico

//Acceso publico: Que es accesible desde cualquier lugar de la app incluso desde otros paquetes

//Acceso por defecto: La clase solo puede ser accesible por el mismo paquete;

public class Access {
    
    public static void main(String[] args){
       OtherClass other = new OtherClass();
       other.sayHello();
       
       Persona person = new Persona("Pepito", "Perez", 15);
        System.out.println(person.getAge());
        System.out.println(person.getFullname());
    }
    
}
