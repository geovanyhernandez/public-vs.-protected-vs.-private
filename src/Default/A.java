/*Si usted no utiliza ningún modificador, lo implementara  
el modificador por defecto es accesible sólo dentro del paquete.*/
/*En este ejemplo, hemos creado dos paquetes paquete y mypack. 
Estamos accediendo a la clase A de fuera de su paquete, ya que una clase no es pública, 
por lo que no se puede acceder desde el exterior del paquete.*/
package pack;  
class A{  
  void msg(){
      System.out.println("Hola");
      
  }  
}  