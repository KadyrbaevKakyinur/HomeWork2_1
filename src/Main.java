public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter(" дом животных ", " ленино 21 ");


        Dog objectA = new Dog(" Бобик ",shelter, BreedEnum.породистая," серый " );


        Puppy objectB = new Puppy(" Барсик ",shelter,BreedEnum.породистая," белый ");
        Puppy objectC = new Puppy(" Зверь ", shelter , BreedEnum.беспородистая," черный ");


        Dog object = new Dog(" Бобик ",shelter, BreedEnum.породистая );

        System.out.println(objectA.getShelter().getAddres()+ objectA.getShelter().getName()+objectA.getName()+
                objectA.getColor()+objectA.getBreedEnum());

        System.out.println(objectB.getShelter().getAddres()+ objectB.getShelter().getName()+objectB.getName()+
                objectB.getColor()+objectB.getBreedEnum());

        System.out.println(objectC.getShelter().getAddres()+ objectC.getShelter().getName()+objectC.getName()+
                objectC.getColor()+objectC.getBreedEnum());

        System.out.println(object.getShelter().getAddres()+ object.getShelter().getName()+object.getName()+
               object.getBreedEnum());





    }
}