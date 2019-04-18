package by.bntu.fitr.povt.beltring.javalabs.lab10.model.entity;

import java.util.Arrays;

public class NetworkOfPharmacies {
    private final int DEFAULT_SIZE = 0;
    
    private Pharmacy[] pharmacies; 
    private String city;

    public NetworkOfPharmacies() {
        pharmacies = new Pharmacy[DEFAULT_SIZE];
    }

    public NetworkOfPharmacies(String city) {
        this.city = city;
        pharmacies = new Pharmacy[DEFAULT_SIZE];
    }

    public NetworkOfPharmacies(Pharmacy[] pharmacies, String city) {
        this.pharmacies = pharmacies;
        this.city = city;
    }

    public NetworkOfPharmacies(NetworkOfPharmacies networkOfPharmacies) {
        city = networkOfPharmacies.city;
        pharmacies = Arrays.copyOf(networkOfPharmacies. pharmacies, 
                networkOfPharmacies.pharmacies.length);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public void add(Pharmacy pharmacy){
         pharmacies = Arrays.copyOf (pharmacies,  pharmacies.length + 1);
        
         pharmacies[ pharmacies.length - 1] = pharmacy;
    }

    @Override
    public String toString() {
        StringBuilder builder;
        builder = new StringBuilder(city + "\n");
        
        for (Pharmacy pharmacy :  pharmacies) {
            builder.append(pharmacy.toString());
        }
       
        return builder.toString();
    }
        
}