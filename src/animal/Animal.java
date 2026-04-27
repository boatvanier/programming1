package animal;

public class Animal {
    private String name;
    private Species species;
    private double weight;
    private String id;

    private static int animalCount;

    public Animal(double weight, Species species, String name, String id) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 1.0;
        }
        this.species = species;

        //short-circuit evaluation
        if (name != null && !name.isBlank() && name.length()<50) {
            this.name = name;
        }else {
            this.name = "unknown";
        }
        //example for short-circuit with or"||"
//        if(name == null || name.isBlank()) {
//            System.out.println("invalid");
//        }
        this.id = id;
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Species getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
//        if(name == null || name.isBlank()) {
//            throw new IllegalArgumentException("name is not valid");
//        }
//        this.name = name;
        if (name != null && !name.isBlank() && name.length() < 50) {
            this.name = name;
        }else {
            System.out.println("Invalid name");
        }
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }else{
            System.out.println("weight is invalid");
        }
    }

    public void loseWeightByPercentage(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            weight = weight * (1-percentage/100);
        } else {
            System.out.println("invalid percentage");
        }
    }
    public void loseWeight(double value, boolean isPercentage) {}
    public void loseWeight(double weight){}
    public void loseWeight(int percentage){}

    public void displayInfo() {
        System.out.println("Id:" +id);
        System.out.println("Name:" + name);
        System.out.println("animal.Species:" + species);
        System.out.println("weight:" + weight);
    }
}
