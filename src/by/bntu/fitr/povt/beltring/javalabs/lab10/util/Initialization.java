package by.bntu.fitr.povt.beltring.javalabs.lab10.util;


import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Medication;


public class Initialization {
      
    public static Medication createMedicationObject(String name){
        int shelfLife = rnd(Const.MIN_SHELFLIFE,Const.MAX_SHELFLIFE);
        int cost = rnd(Const.MIN_COST,Const.MAX_COST);
        int barCode = rnd(Const.MIN_BARCODE,Const.MAX_BARCODE);

        return new Medication(name, shelfLife,  cost,  barCode);
    }
    
    public static Medication createMedicationObject(){
        String name = UserInput.inputStr("Enter name medication:");
        int shelfLife = UserInput.inputInt("Enter the shelf life of the medication:");
        int cost = UserInput.inputInt("Enter the cost:");
        int barCode = UserInput.inputInt("Enter the barCode:");
        
        return new Medication(name, shelfLife,  cost,  barCode);
    }
    
    public static int rnd(int min, int max){
	max -= min;
	return (int) (Math.random() * ++max) + min;
    }
}