public class Dog extends Animal {
    private String color;


    public Dog(String name, Shelter shelter, BreedEnum breedEnum, String color) {
        super(name, shelter, breedEnum);
        this.color = color;
    }

    public Dog(String name, Shelter shelter, BreedEnum breedEnum) {
        super(name, shelter, breedEnum);
    }

    public String getColor() {
        return color;
    }


}
