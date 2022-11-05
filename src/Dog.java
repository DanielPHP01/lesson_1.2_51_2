import java.lang.reflect.Array;
import java.util.Arrays;

public class Dog extends Pet {
    String name, breed;
    String[] commands;

    public Dog(Integer age, Color color, Shelter shelter) {
        super(age, color, shelter);
    }

    public Dog(Integer age, Color color, Shelter shelter, String name, String breed) {
        super(age, color, shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(Integer age, Color color, Shelter shelter, String name, String breed, String[] commands) {
        super(age, color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    void makeVoice(String voice, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }

    void makeVoice(int count, String voice) {
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }

    void makeVoice() {
        System.out.println("WOF,WOF");
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + "\n Name " + name
                + "\n Breed " + breed
                + "\n Commands" + Arrays.toString(commands);
    }
}

