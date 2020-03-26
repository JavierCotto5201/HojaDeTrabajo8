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
	public static void main(String[] args) {
		try {
            Scanner input = new Scanner(new File("personas.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
