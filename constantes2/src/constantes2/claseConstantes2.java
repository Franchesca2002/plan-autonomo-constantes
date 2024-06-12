package constantes2;

public class claseConstantes2 {

	public static final int EDAD_MINIMA_VOTAR=18;
	
	public static void main(String[] args) {
		int edad=16;
		
		if (edad >= EDAD_MINIMA_VOTAR) {
			System.out.println("El ciudadano puede votar");
			}else {
				System.out.println("El ciudadano no puede votar");
			}
		

	}

}
