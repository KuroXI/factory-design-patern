public class Cat implements Pet {
	private Integer noOfLives;
	
	public Cat(Integer noOfLives) {
		this.noOfLives = noOfLives;
	}
	
	public Cat() {}
	
	public Integer getNoOfLives() {
		return this.noOfLives;
	}
	
	public void setNoOfLives(Integer noOfLives) {
		this.noOfLives = noOfLives;
	}
	
	@Override
	public String makeSound() {
		return "Meow,  meow!";
	}
	
	@Override
	public String play() {
		return "Catching/pursuing moving objects!";
	}
}