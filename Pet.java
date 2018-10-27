
public class Pet {

private  String petname;
private  String petType;

public Pet(String petname, String petType){
	this.setPetname(petname);
	this.setPetType(petType);
}

public void setPetname(String petname) {
	this.petname = petname;
}

public String getPetname() {
	return petname;
}

public void setPetType(String petType) {
	this.petType = petType;
}

public String getPetType() {
	return petType;
}
public void say(){
}
}
