import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
	static int opcion = 0;

	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		while (opcion != 3) {
			System.out.println("MENU PRINCIPAL\n");
			System.out.println("1.- Agregar empleado");
			System.out.println("2.- Listas de empleados");
			System.out.println("3.- SALIR");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("AGREGAR EMPLEADOS");
				System.out.println("Seleccione el tipo de arreglo que desea usar para guardar la lista");
				System.out.println("1.- ArrayList");
				System.out.println("2.- LinkedList");
				System.out.println("3.- Vector");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					final class CreaLista {
						static ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
						Scanner scan = new Scanner(System.in);
						void Crear() {
							
							System.out.println("1.- ArrayList");
							String nombre;
							String apellido;
							int edad, altura;
							// Variable auxiliar que contendrá la referencia a cada empleado nuevo.
							Empleado aux;
							int opc = 1;
							while (opc == 1) {
								// leer datos de cada usuario
								
								System.out.println("Nombre: ");
								nombre = scan.nextLine();
								System.out.print("Apellido: ");
								apellido = scan.nextLine();
								System.out.print("edad: ");
								edad = scan.nextInt();
								System.out.print("altura (cm's): ");
								altura = scan.nextInt();
								sc.nextLine(); // limpiar el intro
								aux = new Empleado(); // Se crea un objeto empleado y se asigna su referencia a aux
								// se asignan valores a los atributos del nuevo objeto
								aux.setNombres(nombre);
								aux.setApellidos(apellido);
								aux.setEdad(edad);
								aux.setAltura(altura);
								// se añade el objeto al final del array
								Empleados.add(aux);
								System.out.println(aux.toString());
								System.out.println("¿Desea añadir un nuevo empleado? (SI=1-NO=2): ");
								opc = scan.nextInt();
								scan.nextLine(); // limpiar el intro
								if (opc == 2) {
									System.out.println("**********************************\n\n\n");
									break;
								}
							}
						}
					}
					CreaLista obj1 = new CreaLista();
					obj1.Crear();
					break;
				case 2:

					class Lista {
						void Crear() {
							System.out.println("2.- LinkedList");
						}
					}
					Lista obj2 = new Lista();
					obj2.Crear();

					break;
				case 3:

					class Lista {
						void Crear() {
							System.out.println("3.- Vector");
						}
					}
					Lista obj3 = new Lista();
					obj3.Crear();
					break;
				}
				break;
			case 2:
				System.out.println("LISTAS DE EMPLEADOS");
				System.out.println("Seleccione el tipo de arreglo que usó para guardar la lista");
				System.out.println("1.- ArrayList");
				System.out.println("2.- LinkedList");
				System.out.println("3.- Vector");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					class Lista {
						void Cargar() {
							System.out.println("1.- ArrayList");
							System.out.println(Empleados.toString());
						}
					}
					Lista obj4 = new Lista();
					//obj4.Crear();
					break;
				case 2:

					class Lista {
						void Crear() {
							System.out.println("2.- LinkedList");
						}
					}
					Lista obj5 = new Lista();
					obj5.Crear();

					break;
				case 3:

					class Lista {
						void Crear() {
							System.out.println("3.- Vector");
						}
					}
					Lista obj6 = new Lista();
					obj6.Crear();
					break;
				}
				break;
			case 3:
				opcion = 3;
				sc.close();
				break;

			}
		}

	}
}
