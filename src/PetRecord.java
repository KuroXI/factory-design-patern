public class PetRecord {
	private String petId;
	private String petName;
	private Pet pet;
	
	public PetRecord(String petId, String petName, Pet pet) {
		this.petId = petId;
		this.petName = petName;
		this.pet = pet;
	}
	
	public PetRecord() {}
	
	public String getPetId() {
		return this.petId;
	}
	
	public String getPetName() {
		return this.petName;
	}
	
	public Pet getPet() {
		return this.pet;
	}
	
	public void setPetId(String petId) {
		this.petId = petId;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
}
