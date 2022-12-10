package externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class Region implements Externalizable{
	private String climate;
	private Double population;
	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Region(String climate, Double population) {
		super();
		this.climate = climate;
		this.population = population;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public Double getPopulation() {
		return population;
	}

	public void setPopulation(Double population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Region [climate=" + climate + ", population=" + population + "]";
	}


	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.climate);
		out.writeDouble(this.population);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.climate =(String) in.readObject();
		this.population = in.readDouble();
	}

	public void printDetails() {
		System.out.println("Country's Climate : " + this.climate);
		System.out.println("Country's Population : " + this.population);
	}
}
