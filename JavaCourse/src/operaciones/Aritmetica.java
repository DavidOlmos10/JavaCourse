
package operaciones;

/**
 *
 * @author David Olmos
 */
public class Aritmetica {
    
     //Definimmos 2 atributos a la clase

    int a;
    int b;

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
