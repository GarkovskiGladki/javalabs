package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;


public class Salve extends Medication {
    
    private final int MIN_WEIGHT = 1;
    
    private int weight;

    public Salve() {
        weight = MIN_WEIGHT;
    }

    public Salve(int weight, String name, int shelfLife, int cost, int barCode) {
        
        super(name, shelfLife, cost, barCode);
        this.weight = weight;
    }

    public Salve(int weight, Medication medication) {
        super(medication);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > MIN_WEIGHT)
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", salve weight:" 
                + weight + " g')";
    }
}
