import java.util.ArrayList;

public class Environment {

	private double temperature; //temperature
	private String colorTone;
	private ArrayList<Animal> animals; //animals that live here

	public Environment()  
	{

	}

	public Environment(double temperature, String colorTone, ArrayList<Animal> animals)
	{
		this.temperature = temperature; 
		this.colorTone = colorTone;
		this.animals = animals ; 
	}

}
