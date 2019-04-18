package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import by.bntu.fitr.povt.beltring.javalabs.lab10.util.Const;

public class Medication {
    private String name;
    private int shelfLife;
    private int cost;
    private int barCode;
    
    public Medication() {
        name = "";
        shelfLife = Const.DEFAULT_VALUE;      
        cost = Const.DEFAULT_VALUE;
        barCode = Const.DEFAULT_VALUE;
    }
    public Medication(Medication medication){
        name = medication.name;
        shelfLife = medication.shelfLife;
        cost = medication.cost;
        barCode = medication.barCode;
    }
    public Medication(String name, int shelfLife, int cost, int barCode) {
        this.name = name;
        this.shelfLife = shelfLife;
        this.cost = cost;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public int getCost() {
        return cost;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }
    
   
    public void setName(String name) {
        this.name = name;
    }

    public void setShelfLife(int shelfLife) {
        if(shelfLife > Const.MIN_SHELFLIFE){
          this.shelfLife = shelfLife;  
        }
    }

    public void setCost(int cost) {
        if(cost > 0){
           this.cost = cost; 
        } 
    }

    @Override
    public String toString() {
        return "Medication{" + "name=" + name 
                + ", shelfLife=" + shelfLife + 
                "months , cost=" + cost + "$, barcode=" 
                + barCode + '}';
    }

   
}



   

    

