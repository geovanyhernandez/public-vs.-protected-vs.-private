/*El modificador de acceso protegido es accesible dentro del paquete y fuera del paquete, pero sólo a través de la herencia.*/
/*hemos creado  dospaquetes: pack y mypack. La clase A de paquete pack es pública,
por lo que se puede acceder desde el exterior del paquete. Pero el método msg de este paquete es declarada como protegida,
por lo que se puede acceder desde fuera de la clase sólo a través de la herencia.*/
package pack;  
    public class A{  
    protected void msg(){
    System.out.println("Hola");
    }  
}  