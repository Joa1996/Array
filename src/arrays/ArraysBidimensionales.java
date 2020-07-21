
/*Los Arrays bidimensionales son aquellos que tienen mas de una dimension, a estos se los conoce como tablas o matrices, es posible crear arrays de tantas dimensiones como
requieran sus aplicaciones, esto es, tres, cuatro o más dimensiones. Una Array de mas de una dimension es en realidad un Array de Array, es decir es un array
dento de otro array, o tambien se puede decir que es un array unidimensional en la cual en cada posicion de este array tenemos una nueva columna con una cierta
cantidad de filas, Los elementos de los arrays se almacenan en memoria de modo que el subíndice más próximo al nombre del array es la fila y el otro subíndice, la columna
*/

package arrays;

public class ArraysBidimensionales
{
    public  int  array()
    {
  //Declaracion de un Array bidimensional
   int tabla [][];
   int [][] tabla2;
  //Para reservar memoria y especificar el número de filas y de columnas se utiliza el operador new.
  tabla =new int [3][10];//Creamos una matriz de 3 filas y 10 columnas
  String pruebas[][]=new String[10][10];//Creamos una matriz de 10 filas y 10 columnas
 //Inicializacion de un Array bidimensional
  int tabla1[][]={{2,3,4},{2,6,6}}; //Se ha definido una matriz de dos filas por tres columnas cada fila.
  //Para poder apreciarlo mejor lo escribimos asi:
  /*
  int tabla1[][]={ {2,3,4},
                   {2,6,6} }; */
  //Tambien podemos crear Arrays Bidmensionales no cuadradas como por ej.
  double tb[][]={{1.5, 2.5},{5.0,0.0,1.5}}; //Se he definido una matriz de dos filas, la primera con dos columnas y la segunda con tres. 
  //Para poder introducir y extraer datos  a los elementos de un Array Bidimensional, se debe especificar los indices de la fila y la columna
  tabla[2][5]=22;//Decimos que en el lugar formado por la fila 2 y la columna 5, se guarde o se introduzca el numero 22
  int extraccion=tabla[1][3];//Decimos que en el lugar formado por la fila 1 y la columna 3, se extraiga lo que este almacenado ahi y se lo guarde en la variable extraccion
  
//Array de mas de 2 Dimensiones, Java proporciona la posibilidad de almacenar varias dimensiones, aunque rara vez los
//datos del mundo real requieren más de dos o tres dimensiones. La forma más fácil de dibujar un array de tres dimensiones es imaginar un cubo
/*Un array tridimensional se puede considerar como un conjunto de arrays
bidimensionales combinados juntos para formar, en profundidad, una tercera
dimensión. El cubo se construye con filas (dimensión vertical), columnas (dimensión
horizontal) y planos (dimensión en profundidad)*/  
  int cubo[][][]=new int[10][5][2];
  
  /*Utilizacion de Arrays Como parametros, En Java, todas las variables de tipos primitivos, double, float, char, int, boolean se 
    pasan por valor. Los objetos siempre se pasan por referencia, los arrays en Java se
    considera que son objetos y por tanto se pasan por referencia (dirección). Esto
    significa que cuando se llama a un método o función y se utiliza un array como
   parámetro, se debe tener cuidado de no modificar el array en una función llamada
 */
     return tabla1.length ;
  
    }
    int tabla[]=new int[20];
    public void arrayparametro(int tabla[])
    {
        int recibidor[]=new int[10];
        for(int i=0;i<tabla.length;i++)
        {
            recibidor[i]=tabla[i];//pasamos los datos del array que viene como parametro al otro array
        }
            }
            
            }
