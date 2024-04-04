package practica1;
import java.util.Scanner;

/**
 * Clase que permite saber la nota final de un alumno
 * en base al valor de tres notas introducidas
 * 
 * @author Cristian
 * 
 * @version 1.0
 * 
 * @since 04/04/2024
 */
		public class notas {
			//declaramos la variables que nos hacen falta
			
			/**
			 * variables de las notas que se han de introducir de cada unidad
			 */
			double uf1, uf2, uf3;
			
			/**
			 * variables de las notas modificadas por el valor de cada uf y la nota definitiva
			 */
			double acu1, acu2, acu3, def;
			//utilizames ecaner para poder introducir datos
			/**
			 * utilizacion de Scanner para introducir los datos
			 */
			Scanner entrada = new Scanner(System.in);
			
			///vamos ca crear un metodo para ingresar 
			
			/**
			 * metodo que nos permite ingresar las notas
			 */
			public void IngresaNotas() {
				//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
				System.out.println("ingrese las notas del estudiante");
				
				System.out.print("ingrese nota 1: ");
				
				uf1= entrada.nextDouble();

				
				
				System.out.print("ingrese nota 2: ");
				
				uf2= entrada.nextDouble();
				System.out.print("ingrese nota 3: ");
				
				uf3= entrada.nextDouble();
				
			
			}
			
			// metodo para comprobar bien entroduccion de notas
			
			/**
			 * metodo usado para comprobar la correcta introducción de notas
			 * si la nota es mayor que 10, nos indicara el error
			 * @see #IngresaNotas()
			 * 
			 */
			public void comprobarcion(){
				
				if (uf1>10) {
					System.out.println(" nota1 mal introducida");
					
				}else {
					System.out.println(" nota1 correcta");
				}
				
				if (uf2>10) {
					System.out.println(" nota2 mal introducida");
					
				}else {
					System.out.println(" nota2 correcta");
				}
				if (uf3>10) {
					System.out.println(" nota3 mal introducida");
					
				}else {
					System.out.println(" nota3 correcta");
				}
				
					
				
				
			}
			// metodo para calcular nota
			
			/**
			 * metodo que utilizamos para calcular las notas
			 * las notas introducidas son modificados por el valor relativo de cada uf
			 * la nota definitiva surge de la suma de las notas acumuladas
			 * @throws NumberFormatException Esta excepcion surge si no se ha introducido un numero
			 */
			public void Calculonotas() throws NumberFormatException {
				try {
				acu1= uf1*0.25;
				acu2 = uf2 * 0.25;
				acu3 = uf3 * 0.50;
				
				def = acu1 + acu2+ acu3;
				}
				catch(NumberFormatException e) {
					throw new NumberFormatException ("No es un número");
				}
				
				//hasta aqui la tenemos calculada peor no la mostramos
			}
			/**
			 * metodo que imprime la informacion obtenida por 
			 * @see #Calculonotas()
			 * por pantalla
			 * 
			 */
			public void Mostrar() {
				//print ln lo que hace es que al terminar el print baja la linea
				System.out.println(" notas introducidas son:");
				System.out.println(" nota1 = " + uf1);
				System.out.println(" nota2 = " + uf2);
				System.out.println(" nota3 = " + uf3);
				
				System.out.println(" acumuado 1 = "+ acu1);
				System.out.println(" acumuado 2 = "+ acu2);
				System.out.println(" acumuado 3 = "+ acu3);
				
				System.out.println(" nota definitiva es = "+ def);
				
			}
			/**
			 * metodo que devuelve si la nota definitiva es 
			 * aprobada, suspensa o existe un error
			 * 
			 */
			public void aprobado() {
					
					if(def<5 && def>=0) {
						System.out.println("suspendio");
					}else {
						if (def>=5 && def<=10 ) {
						System.out.println("aprobado");
						}else {
							System.out.println(" error en la notas");
						}
					}
				}
				
				/**
				 * metodo estatico para instanciar la clase notas
				 * @param args argumento para cmd. Sin uso
				 */
			public static void main(String[] args) {
				// creamos mecanimos para llamar a cualquier metodo fuero de la clase
				notas fc= new notas();
				
				fc.IngresaNotas();
				
				fc.comprobarcion();
				

				fc.Calculonotas();
				
				fc.Mostrar();
				
				fc.aprobado();
				
			}

		}

	


