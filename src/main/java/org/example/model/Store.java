package org.example.model;

import java.sql.SQLOutput;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products=new ProductForSale[9];
        Chocolate  chocolate= new Chocolate("Çikolata",1,"Dünyanın en güzel çikolataları",34);
        Coke coke=new Coke("Kola",2.5,"Soğuk içiniz:",23);
        Bread bread=new Bread("Köy ekmeği",0.75,"Taze ekmek",89);

        products[0]=chocolate;
        products[1] =coke;
        products[2]=bread;
        listProducts(products);


        //listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();

            }
            else{
                System.out.println("null ürün bulundu.");
            }

        }
    }}