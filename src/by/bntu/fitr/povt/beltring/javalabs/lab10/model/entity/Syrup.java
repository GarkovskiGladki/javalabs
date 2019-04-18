package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;


public class Syrup extends Medication {
    
    private final int MIN_VOLUME = 1;
    
    private int volume;

    public Syrup() {
        volume = MIN_VOLUME;
    }

    public Syrup(int volume, String name, int shelfLife, int cost, int barCode) {
        
        super(name, shelfLife, cost, barCode);
        this.volume = volume;
    }

    public Syrup(int volume, Medication medication) {
        super(medication);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > MIN_VOLUME)
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", salve weight:" 
                + volume + " g')";
    }
}