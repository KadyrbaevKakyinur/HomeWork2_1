public final class Puppy extends Dog {
    private String color;


    public Puppy(String name, Shelter shelter, BreedEnum breedEnum, String color) {
        super(name, shelter, breedEnum);
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
