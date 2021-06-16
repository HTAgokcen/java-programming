package reblit;

public class Earth_Create {
    public static void main(String[] args) {
        Animal_Species_Create Animal1 = new Animal_Species_Create();
        Animal1.setInfo("cat", 21, 3);
        Animal1.toString();
        System.out.println(Animal1);
        System.out.println(Animal1.toString());
        System.out.println(Animal1.getName());
        System.out.println(Animal1.getPopulation());
        System.out.println(Animal1.getGrowthRate());

    }
}
