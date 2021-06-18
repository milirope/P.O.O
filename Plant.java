package Greenhouse;

	
	public class Plant extends Main{
		private String type;
		private String name;
		private String color;
		private String flower;
		private String seed;
		private String fruit;
		private String spore;
		

public Plant(String type, String name, String color, String flower, String seed, String fruit, String spore) {
	this.type = type;
	this.name = name;
	this.color = color;
	this.flower = flower;
	this.seed = seed;
	this.fruit = fruit;
	this.spore = spore;
}
	

public Plant() {
	// TODO Auto-generated constructor stub
}


public void result() {
}

public String gettype() {
	return type;
}


public void settype(String type) {
	this.type = type;
}
public String getname() {
	return name;
}

public void setname(String name) {
	this.name = name;
}

public String getcolor() {
	return color;
}

public void setcolor(String color) {
	this.color = color;
}

public String getflower() {
	return flower;
}

public void setflower(String flower) {
	this.flower = flower;
}

public String getseed() {
	return seed;
}

public void setseed(String seed) {
	this.seed = seed;
}

public String getfruit() {
	return fruit;
}

public void setfruit(String fruit) {
	this.fruit = fruit;
}


public String getspore() {
	return spore;
}

public void setspore(String spore) {
	this.spore = spore;
}

@Override
public String toString() {
	
	return " Clasificacion:" + this.gettype() +  "\n Nombre:" + this.getname() + "\n Color:" + this.getcolor() + "\n Flor:" + this.getflower() + 
			"\n Semilla:" + this.getseed() + "\n Fruta:" + this.getfruit() + "\n Esporas:" + this.getspore();
};
}

