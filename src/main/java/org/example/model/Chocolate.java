package org.example.model;

public class Chocolate extends ProductForSale {
    private double cocoaRate;
    public Chocolate(String type,double price,String description){
        super(type,price,description);
    }
    public Chocolate(String type,double price,String description,double cocoaRate){
        super(type,price,description);
        this.cocoaRate=cocoaRate;
    }

    @Override
    public void showDetails(){
        System.out.println("Ürün tipi: "+ getType());
        System.out.println("Ürün Fiyatı: "+getPrice());
        System.out.println("Ürün açıklaması:"+ getDescription());
        System.out.println("Kakao oranı: "+this.cocoaRate);
    }
}
