package animales;

public abstract class AnimalBasico implements IAnimal {

	//Las variables
	String nombre;
	String color;
	int edad;
	int velocidad;

	
	/**
	 * Elimina el animal de la partida en el caso de perder o hacer trampa
	 */
	public void eliminarAnimal() {
		
	}

	
	@Override
	public void resetea() {
		
	}

}
