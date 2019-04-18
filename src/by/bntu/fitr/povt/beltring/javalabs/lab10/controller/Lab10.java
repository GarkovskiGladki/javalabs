package by.bntu.fitr.povt.beltring.javalabs.lab10.controller;

import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Medication;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Pharmacy;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.NetworkOfPharmacies;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Salve;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Syrup;
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity.Tablets;  
import by.bntu.fitr.povt.beltring.javalabs.lab10.model.logic.Seller;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.Initialization;
import by.bntu.fitr.povt.beltring.javalabs.lab10.util.UserInput;
import by.bntu.fitr.povt.beltring.javalabs.lab10.view.Printer;

public class Lab10 {
     
    public static void main(String[] args) { 
        boolean notExit = true;
        int choice;
        
        Pharmacy pharmacy1 = new Pharmacy("Paracetamol");
        //Pharmacy pharmacy2 = new Pharmacy("Teraflu");
        
        for (int i = 0; i < 4; i++) {
            pharmacy1.add(Initialization.createMedicationObject("Paracetamol"));
        }
  
        //pharmacy2.add(Initialization.createMedicationObject("Teraflu"));
        
        NetworkOfPharmacies networkPharmacies = new NetworkOfPharmacies("Minsk");
        networkPharmacies.add(pharmacy1);
        //c networkPharmacies.add(pharmacy2);    
        
        while(notExit){
            Printer.print("\n1.List of available medication.\n2.Add medication.\n"
                    + "3.Remove medication.\n4.Find the most expensive medicine.\n"
                    + "5.Find the cheapest medicine.\n"
                    + "6.Find the maximum weight of the pill.\n0.Exit");
            choice = UserInput.inputInt("\nSelect menu item:");
            
            switch(choice){
                case 1: Printer.print(networkPharmacies); break;
                case 2: Medication medication = Initialization.createMedicationObject(); 
                pharmacy1.add(medication); break;
                case 3: int barCode = UserInput.inputInt("Enter "
                        + "the bar code of the medication:");
                        pharmacy1.remove(barCode); break;
                case 4: Printer.print(Seller.maximumMedicationCost(pharmacy1) + "\n"); break;
                case 5: Printer.print(Seller.minimumMedicationCost(pharmacy1) + "\n"); break;
                case 6: Printer.print(Seller.maximumTabletWeight(pharmacy1) + "\n"); break;
                case 0: notExit = false; break;
            }
        }        
    }
}