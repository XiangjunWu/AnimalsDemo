package at.campus02.wu;

public class Animal {
    private String name;
    private int age;
    private String species;
    private String animalLoud;

    Animal(String name, int age, String species, String animalLoud){
        this.name = name;
        this.age = age;
        this.species = species;
        this.animalLoud = animalLoud;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String giveAnimalLoud(){
        return this.animalLoud;
    }

    public String getNameAndAge(){
        return this.name + " " + this.age;
    }
    public String ageCategory(){
        if(this.age<=2 && this.age>=0){
            return "baby animal";
        } else if(this.age > 4){
            return "old animal";
        } else if(this.age > 2){
            return "young animal";
        } else{
            return "invalid input";
        }
    }


}
