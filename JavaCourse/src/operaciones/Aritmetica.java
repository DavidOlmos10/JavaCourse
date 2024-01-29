
package operaciones;

/**
 *
 * @author David Olmos
 */
public class Aritmetica {
    
     //Definimmos 2 atributos a la clase

    int a;
    int b;
    
    //Se creara un constructor vacio
    //Los constructores no regresan ningun tipo de dato
    
    public Aritmetica(){
        System.out.println("Ejecutando un constructor");
    }
    
    //Sobrecarga de constructores, tiene que ver con agregaar 1 o 2 contructores a nuestra clase
     public Aritmetica(int a, int b){
         this.a = a;
         this.b = b;
         System.out.println("Ejecutando constructor con argumentos");
     }

    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    // Se va a crear un metodo el cual regrese el resultado de la suma
    
    public int sumarConRetorno(){
   //     int resultado = a + b;
   //     resultado resltado;
        return this.a + this.b;
    }
    
    //Vamos a agregar para que reciba argumentos
    public int sumarConArgumentos(int a, int b){
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b; //El argumento b se asigna al atributo this.b
       // return a + b;
       return this.sumarConRetorno();
    }
}
