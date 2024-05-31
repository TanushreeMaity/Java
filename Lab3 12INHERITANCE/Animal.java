//Create a base class Animal with a parameterized constructor that sets the name and species fields. Then, create a subclass Dog that inherits from Animal and adds an additional field breed. Write constructors for both classes.
// Base class representing an Animal
class Animal {
    private String name;    // The name of the animal
    private String species; // The species of the animal

    // Constructor to initialize the Animal
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Method to get the name of the animal
    public String getName() {
        return name;
    }

    // Method to get the species of the animal
    public String getSpecies() {
        return species;
    }
}

// Subclass Dog that extends Animal
class Dog extends Animal {
    private String breed; // The breed of the dog

    // Constructor to initialize the Dog
    public Dog(String name, String species, String breed) {
        super(name, species); // Call the constructor of the base class (Animal)
        this.breed = breed;   // Initialize the breed of the dog
    }

    // Method to get the breed of the dog
    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        // Create an Animal object and a Dog object
        Animal animal = new Animal("Fido", "Canine");
        Dog dog = new Dog("Buddy", "Canine", "Golden Retriever");

        // Print information about the Animal and Dog
        System.out.println("Animal: " + animal.getName() + ", Species: " + animal.getSpecies());
        System.out.println("Dog: " + dog.getName() + ", Species: " + dog.getSpecies() + ", Breed: " + dog.getBreed());
    }
}

