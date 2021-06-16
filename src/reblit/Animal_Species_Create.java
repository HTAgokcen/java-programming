package reblit;

public class Animal_Species_Create {

    /**
     * Create a class AnimalSpecies-Create these variables in the class: name (String),
     * population (int  -for practice we can consider 1 unit as 1 million.
     * Ex: population = 20 would represent 20 million ), growth rate (int -percent number)
     * -Create these methods (non-static):-setInfo()-parameters: name, population, and growth rate
     * (Do not name the parameters the same as your class variable names).
     *
     * -returns: void-action: assigns the name, population, and growth rate
     * of the object given from the parameters.-getName()-no parameters, returns the name variable -getPopulation
     *
     * ()-no parameters, returns the population variable-getGrowthRate()-no parameters, returns the growth rate
     * variable-toString() generate the toStringmethod as shown in class. See Murodil_only for screenshots of steps-Create
     * a class Earth-Create AnimalSpeciesobjects, call the getInfoand getmethods of the objects
     */

   String name; int population; int growthRate;
   public void setInfo(String name1, int population1, int growthRate1) {
       name = name1;
       population = population1;
       growthRate = growthRate1;


   }

    @Override
    public String toString() {
        return "Animal_Species_Create{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }

    public String  getName(){
       return name;
   }
   public int getPopulation(){
       return population;
   }
   public int getGrowthRate(){
       return growthRate;
    }

}


