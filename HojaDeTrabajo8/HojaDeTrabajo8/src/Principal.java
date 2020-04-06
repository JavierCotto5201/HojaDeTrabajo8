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
		try {
            Scanner input = new Scanner(new File("C:\\Users\\Javier Cotto\\Desktop\\UVG Trabajos\\3er Semestre\\Estructura de datos\\HojaDeTrabajo8.1\\HojaDeTrabajo8\\HojaDeTrabajo8\\HojaDeTrabajo8\\pacientes.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String paciente [] = line.split(", ");
                String nom = paciente[0];
                String des = paciente[1];
                String code = paciente[2];
                
                vec.add(new Paciente(nom, des, code));
                
                if(!vec.isEmpty()) {
                	System.out.println(vec.getFirst().toString());
                }
                
            
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
