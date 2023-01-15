public class Animal  {
    private String name;
    private Shelter shelter;
    private BreedEnum breedEnum;

    public Animal(String name, Shelter shelter, BreedEnum breedEnum) {
        this.name = name;
        this.shelter = shelter;
        this.breedEnum = breedEnum;
    }

    public String getName() {
        return name;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public BreedEnum getBreedEnum() {
        return breedEnum;
    }



}
