
package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import java.util.Arrays;

public class Pharmacy {
    
    private String name;
    private Medication[] medications;
    
    public Pharmacy() {
        medications = new Medication[0];
    }
   
    public Pharmacy(String name) {
        this.name = name;
        medications = new Medication[0];
    }

    public Pharmacy(String name, Medication[] medications) {
        this.name = name;
        this.medications = medications;
    }
    
    public Pharmacy(Pharmacy pharmacy){
        name = pharmacy.name;
        medications = Arrays.copyOf(pharmacy.medications, pharmacy.medications.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Medication[] getMedications() {
        return medications;
    }

    public void setMedications(Medication[] medications) {
        this.medications = medications;
    }
    
    public Medication get(int index){
        return medications[index];
    }
    
    public int size(){
       return medications.length;
    }
    
    public void add(Medication medication){ 
        medications = Arrays.copyOf(medications, medications.length + 1);
        
        medications[medications.length - 1] = medication;
    }
    
    public void remove(int barCode){
        for(int i = 0;i < medications.length;i++){
            if(medications[i].getBarCode() == barCode){
                for(int j = i; j < medications.length - 1; j++){
                    medications[j] = medications[j+1];
                }
                medications = Arrays.copyOf(medications, medications.length - 1);
                break;
            }
        }
    }
    
    @Override
    public String toString(){
       StringBuilder builder;
       builder = new StringBuilder(name + "\n");
       
        for (Medication medication : medications) {
            builder.append(medication.toString()).append("\n");
        }
       
       return builder.toString();
    }
}
