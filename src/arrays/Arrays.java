
package arrays;
import java.util.Scanner;
import java.util.logging.Logger;
/*
Los Arrays o arreglos son un tipo muy comun de estructura de datos, las estructuras de datos es una forma de organizar datos para que puedan ser utilizados de 
manera eficiente, por ej. si tenemos que almacenar los datos de un curso, no es lo mas eficiente crear una variable por cada alumno, usamos alguna estructura de datos
y almacenamos a todos los alumnos en una estructura comun.
Los Array tambien conocido como vectores son una de las estructuras de datos mas utilizadas, se trata de una estructura de datos en la cual los datos
que almacena son del mismo tipo int,string, etc., Al Array lo podemos ver desde el punto de vista lógico como una matriz de n columnas y 1 fila los elementos se almacenaran como en una fila, uno detras del 
otro, cada posicion del array donde se almacenara los datos tendran dentro del array una posicion unica, y se almacenaran de manera consecutiva, la posicion de cada
elemento se representa con un subindice, Estos números localizan la posición del elemento dentro del array proporcionando acceso directo al array. Si el nombre del array es a, entonces a [0] es el nombre del elemento que está en la
posición 0, a [1] es el nombre del elemento que está en la posición 1, etc.
El acceso a los elementos de la matriz es directa; esto significa que el elemento deseado es obtenido a partir de su índice y no hay que ir buscándolo elemento por elemento.

*/

public class Arrays {

    
    public static void main(String[] args) 
    {
    //Declaracion de un array, hay 2 formas:
        int[]a,b;//De esta forma tanto a y b son arrays
        int c[],d;//De esta forma solo c es un array, d es una variable comun y corriente
        
    //Declaracion del tamaño de un Array
      c=new int[10];// establecemos que el array  tendra 10 elementos
      float notas[]=new float[10];//Tambien podemos realizar la declaracion de cuantos elementos tendra el arrays   al momento de declararlo
/*
Estas declaraciónes hacen que el compilador reserve espacio suficiente para contener 10
datos de tipo entero. En Java, los enteros ocupan, normalmente cuatro bytes, de modo
que un array de diez enteros ocupa 40 bytes de memoria. A esta memoria hay que
añadir cuatro bytes más que utiliza Java para guardar el número de elementos del
array.*/
        System.out.println(c[8]);//De esta forma podemos visualizar que es lo que esta almacenado en la posicion 9 del array( recordemos que las posiciones empiezan a contarse a partir del 0)
       //Dentro del corchete siempre va el numero de distintas posiciones que tiene el ARRAY
        //Para poder saber cuantos elemento tiene un Array usamos el atributo length
        System.out.println(c.length);
        //Amacenamiento en los Arrays
        int e[]={10,20,30,45};//Esto se realiza cuando previamente conocemos la cantidad de elementos que tendra el array, podemos ver que ni siquiera hubo que declarar el tamaño, tan solo cargamos los datos
        //Esto no es eficiente si son muchos datos, para ello podemos usar por ej. un bucle for
        int f[]=new int[30];       
        for(int i=0;i<f.length;i++)
        {
            f[i]=i;
        }
        //Ejemplo de Aplicacion de Array
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos que tendra el Array");
        int cant=sc.nextInt();
        a=new int[cant];//Usamos el Array que declaramos antes
        for(int i=0;i<a.length;i++)
        {
        System.out.println("Ingrese los elementos");
        a[i]=sc.nextInt();
        }
        System.out.println("Los elementos del array son:");
        for(int i=0;i<a.length;i++)
        {
        System.out.println(a[i]);
        }
        
        System.out.println("Ingrese la cantidad de palabras a agregar");
        
        String palabras[]=new String[sc.nextInt()];
        
         for(int i=0;i<palabras.length;i++)
        {
         System.out.println("Ingrese una palabra");
         palabras[i]=sc.nextLine();    
        }
         
         for(int i=0;i<palabras.length;i++)
        {
         System.out.println(palabras[i]);    
        }
       ArraysBidimensionales ab=new ArraysBidimensionales();
        System.out.println(ab.array());  
     
    }


    
    
}
