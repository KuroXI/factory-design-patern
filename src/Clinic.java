import java.util.Scanner;

public class Clinic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		do {
			PetRecord petFile = new PetRecord();
			Pet pet;
			
			System.out.println("\n1 - Dog");
			System.out.println("2 - Cat");
			System.out.println("3 - Exit\n");
			
			System.out.print("Enter your choice: ");
			
			int input = scanner.nextInt();
			switch (input) {
				case 1:
					pet = new Dog();
					petFile.setPetId("D01");
					petFile.setPetName("Bantay");
          petFile.setPet(pet);
					((Dog) pet).setBreed("German Shepperd");
					break;
				case 2:
					pet = new Cat();
					petFile.setPetId("C01");
					petFile.setPetName("Muning");
					petFile.setPet(pet);
					((Cat) pet).setNoOfLives(9);
					break;
				case 3:
					System.out.println("Exit - John Victor Gonzales");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice");
					continue;
			}
			
			displayPetInformation(petFile);
		} while (true);
	}
	
	public static void displayPetInformation(PetRecord petFile) {
		System.out.println("\nPet ID: " + petFile.getPetId());
		System.out.println("Pet Name: " + petFile.getPetName());
		System.out.println("Pet Kind: " + petFile.getPet().getClass().getSimpleName());
		System.out.println("Communication sound: "+ petFile.getPet().makeSound());
		System.out.println("Play mode: " + petFile.getPet().play());
		System.out.println(
			(petFile.getPet().getClass().getSimpleName().equals("Dog")
				? "The dog's breed is " + ((Dog) petFile.getPet()).getBreed() + "!"
				: "Cat has " + ((Cat) petFile.getPet()).getNoOfLives()) + " lives!"
		);
	}
}
