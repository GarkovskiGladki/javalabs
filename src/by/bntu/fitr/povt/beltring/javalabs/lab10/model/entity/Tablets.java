package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;


public class Tablets extends Medication {
    private final int MIN_WEIGHT_TABLET = 1; 
    private final int MIN_NUMBER_TABLET = 1; 
    
    private int weight; 
    private int number; 

    public Tablets() {
        weight = 0;
        number = 0;
    }

    public Tablets(int weight, int number, String name, int shelfLife, int cost, int barCode) {
        super(name, shelfLife, cost, barCode);
        this.weight = weight;
        this.number = number;
    }

    public Tablets(int weight, int number, Medication medication) {
        super(medication);
        this.weight = weight;
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > MIN_WEIGHT_TABLET){
            this.weight = weight;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setCargoHeight(int number) {
        if(number > MIN_NUMBER_TABLET){
            this.number = number;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", tablet weight:" + weight 
                + " mg', number of tablets:" 
                + number + ")";
    }
    
    
}
