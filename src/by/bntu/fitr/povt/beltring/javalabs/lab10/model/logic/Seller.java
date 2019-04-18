package by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Medication;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Pharmacy;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Tablets;


public class Seller {
    public static Medication maximumMedicationCost(Pharmacy pharmacy){
        int max = pharmacy.get(0).getCost();
        Medication maxMedication = pharmacy.get(0);
        
        for(int i = 0; i < pharmacy.size(); i++){
            
            if(max < pharmacy.get(i).getCost()){
                max = pharmacy.get(i).getCost();
                maxMedication = pharmacy.get(i);
            }
            
        }
        
        return maxMedication;
    }
    
    public static Medication minimumMedicationCost(Pharmacy pharmacy){
        int min = pharmacy.get(0).getCost();
        Medication minCar = pharmacy.get(0);
        
        for(int i = 0; i < pharmacy.size(); i++){
            
            if(min > pharmacy.get(i).getCost()){
                min = pharmacy.get(i).getCost();
                minCar = pharmacy.get(i);
            }
            
        }
      
        return minCar;
    }
      
    public static Medication maximumTabletWeight(Pharmacy pharmacy){
        int max = 0;
        Medication maxMedication = pharmacy.get(0);
        Tablets tablets;
        
        for(int i = 0; i < pharmacy.size(); i++){
            
            if(pharmacy.get(i) instanceof Tablets){
                tablets = (Tablets)pharmacy.get(i);
                
                if(max < tablets.getWeight()){
                    max = tablets.getWeight();
                    maxMedication = pharmacy.get(i);
                }
            }
        }
      
        return maxMedication;
    }
}
