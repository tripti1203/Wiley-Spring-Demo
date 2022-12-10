package externalizable;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Country extends Region{
	private String name;
	transient private int code;
	public Country() {
		super();
	}
	public Country(String climate, Double population, String name, int code) {
		super(climate, population);
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + ", getClimate()=" + getClimate() + ", getPopulation()="
				+ getPopulation() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		super.writeExternal(out);
		out.writeObject(this.name);
		out.writeInt(code);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		super.readExternal(in);
		this.name = (String) in.readObject();
		this.code = in.readInt();
	}	
	
	public void printDetails() {
		super.printDetails();
		System.out.println("Country Name : " + this.name);
		System.out.println("Country Code : " + this.code);
	}
}
