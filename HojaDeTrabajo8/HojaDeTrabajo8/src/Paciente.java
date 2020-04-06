import java.io.File;
import java.util.Scanner;
/**
 * @authorJavier Alejandro Cotto Argueta
 * @Carne 19324
 * @date 26/03/19
 **/

public class Paciente implements Comparable<Paciente>{
	private String name;
	private String description;
	private String code;
	
	
	
	public Paciente(String name, String description, String code) {
		this.name = name;
		this.description = description;
		this.code = code;
	}

	//Metodo para devolver paciente con sus atributos
	public String toString() {
		
		return this.getName() + "/" + this.getDescription() + "/" + this.getCode();
	}
	
	//metodo compare to
	@Override
	public int compareTo(Paciente paciente) {
		// TODO Auto-generated method stub	
		
		return this.getCode().compareTo(paciente.getCode());
	}
	
	//Metodos set y get de las variables
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}
	
}
