package view;
/*	
 * 	Imprime o id de 5 threads no console
 * 
 */
import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {
		for (int thread = 0; thread < 5; thread++) {
			Thread tId = new ThreadId();
			tId.start();//Faz a chamada da Thread
		}

	}

}
