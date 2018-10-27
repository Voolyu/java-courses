
public class Client {

	private String name;
	private Pet pet;
	
	public Client(String name, Pet pet){
		this.setName(name);
		this.setPet(pet);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Pet getPet() {
		return pet;
	}
	
}
