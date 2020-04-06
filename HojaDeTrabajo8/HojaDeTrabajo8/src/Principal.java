import java.io.File;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * @authorJavier Alejandro Cotto Argueta
 * @Carne 19324
 * @date 26/03/19
 * @see http://decodigo.com/java-leer-un-archivo-de-texto
 **/
public class Principal {
	private String nom;
	private String des;
	private String code;
	
	public static void main(String[] args) {
		VectorHeap<Paciente> vec = new VectorHeap<>();
		JCFheap<Paciente> vec2 = new JCFheap<>();
		int cont=0;
		int cont1=0;

		//implementacion vector heap
		try {
            Scanner input = new Scanner(new File("C:\\Users\\Javier Cotto\\Desktop\\UVG Trabajos\\3er Semestre\\Estructura de datos\\HojaDeTrabajo8.1\\HojaDeTrabajo8\\HojaDeTrabajo8\\HojaDeTrabajo8\\pacientes.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String paciente [] = line.split(", ");
                String nom = paciente[0];
                String des = paciente[1];
                String code = paciente[2];
                cont++;
                vec.add(new Paciente(nom, des, code));
                	          
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		System.out.println("Implementación Vector Heap\n");
		while (cont!=0){
			if (!vec.isEmpty()) {
				System.out.println("El siguiente Paciente con mayor prioridad de ser atendida es:");
				System.out.println(vec.getFirst().toString());   
				cont--;
			}
			
			if (!vec.isEmpty()) {
				System.out.println("Se atendio a:");
				System.out.println(vec.remove().toString() + "\n");
			}
		}
		System.out.println("\nYa no hay Pacientes que atender");

		//implementacion JCF
		try {
            Scanner input = new Scanner(new File("C:\\Users\\Javier Cotto\\Desktop\\UVG Trabajos\\3er Semestre\\Estructura de datos\\HojaDeTrabajo8.1\\HojaDeTrabajo8\\HojaDeTrabajo8\\HojaDeTrabajo8\\pacientes.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String paciente [] = line.split(", ");
                String nom = paciente[0];
                String des = paciente[1];
                String code = paciente[2];
                cont++;
                vec.add(new Paciente(nom, des, code));
                	          
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		System.out.println("Implementación JDK\n");
		
		while (cont!=0){
			if (!vec.isEmpty()) {
				System.out.println("El siguiente Paciente con mayor prioridad de ser atendida es:");
				System.out.println(vec2.check());   
				cont--;
			}
			
			if (!vec.isEmpty()) {
				System.out.println("Se atendio a:");
				System.out.println(vec2.next() + "\n");
			}
		}
		System.out.println("\nYa no hay Pacientes que atender");
	}	
}

