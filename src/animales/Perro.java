package animales;

public class Perro extends AnimalBasico {

	//Las variables
	double longitudCola;
	int dientes;
	double peso;
	PielPerro piel;
	
	public Perro(double longitudCola, int dientes, double peso, PielPerro piel) {
		this.longitudCola = longitudCola;
		this.dientes = dientes;
		this.peso = peso;
		this.piel = piel;
	}

	@Override
	public void avanza() {
		
	}
	
	
}
