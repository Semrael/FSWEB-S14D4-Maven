package org.example.model;

public class Coke extends ProductForSale {
    private double cokeRate;


    public Coke(String type,double price,String description){
        super(type,price,description);
    }
    public Coke(String type,double price,String description,double cokeRate){
        super(type,price,description);
        this.cokeRate=cokeRate;
    }
    @Override
    public void showDetails(){
        System.out.println("Ürün tipi:"+ getType());
        System.out.println("Ürün Fiyatı: "+ getPrice());
        System.out.println("Ürün açıklaması: "+getDescription());
        System.out.println("Asit oranı:"+ cokeRate);
    }
}
