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

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getColorTone() {
		return colorTone;
	}

	public void setColorTone(String colorTone) {
		this.colorTone = colorTone;
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}

	public void addAnimal(Animal anim) {
		this.animals.add(anim);
	}
}
