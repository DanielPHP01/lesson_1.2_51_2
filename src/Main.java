public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Romashka","Belinka 199");
        Dog rex = new Dog(Pet.generateDefaultAge(), Color.BLACK, shelter,"Rex","Doberman");
        Dog masha= new Dog(Pet.generateDefaultAge(),Color.BROWN,shelter,"Masah", "Queen dogs",new String[]{"Сидеть","Лежать"});
        System.out.println(rex.getInfo());
        rex.makeVoice(3,"GAF,GAF");
        System.out.println(masha.getInfo());
        masha.makeVoice();

    }
}