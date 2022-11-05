import java.util.Random;

public class Pet {
    Integer age;
    Color color;
    Shelter shelter;

    public Pet(Integer age, Color color, Shelter shelter) {
        this.age = age;
        this.color = color;
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public static int generateDefaultAge() {
        return new Random().nextInt(10) + 1;
    }

    public String getInfo() {
        return "Age " + age +
                " \nColor " + color + " " +
                "\nShelter name " + shelter.name +
                " \nShelter address " + shelter.address;
    }
}
