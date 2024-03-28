package org.example.model;

public class Bread extends ProductForSale {
    private double flourRate;
    public Bread(String type,double price,String description){
        super(type,price,description);
    }
    public Bread(String type,double price,String description,double flourRate){
        super(type,price,description);
        this.flourRate=flourRate;
    }
    public void showDetails(){
        System.out.println("Ürün tipi:"+ getType());
        System.out.println("Ürün Fiyatı: "+ getPrice());
        System.out.println("Ürün açıklaması: "+getDescription());
        System.out.println("Un oranı:"+ this.flourRate);
    }
}
