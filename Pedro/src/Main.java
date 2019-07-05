import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Persona> listPersonas=new ArrayList<Persona>();
		
	for (int i = 0; i < 10; i++) {
		
		Persona p=new Persona();
		p.setNombre("pedro"+i);
		
		listPersonas.add(p);
		
	}
	//imprimir los nombres
for (int i = 0; i < 10; i++) {
		
		
		System.out.println( listPersonas.get(i).toString() );
		
	}
	
	

	}

}
