public class Dog implements Pet {
	private String breed;
	
	public Dog(String breed) {
		this.breed = breed;
	}
	
	public Dog() {}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public String makeSound() {
		return "Aw, aw!";
	}
	
	@Override
	public String play() {
		return "Catching objects that you throw!";
	}
}