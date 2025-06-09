package com.driver;

import java.util.Scanner;

public class Pizza {

    private int price;
    private boolean isVeg;
    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean takeawayAdded = false;
    private boolean billGenerated = false;
    private StringBuilder bill;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.bill = new StringBuilder(" Base Price Of The Pizza:" + this.price +" \n");
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!extraCheeseAdded) {
            this.price += 80;
            bill.append("Extra Cheese Added: 80\n");
            extraCheeseAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if (!extraToppingsAdded) {
            this.price += isVeg ? 70 : 120;
            bill.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!takeawayAdded) {
            this.price += 20;
            bill.append("Paperbag Added: 20\n");
            takeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!billGenerated) {
            bill.append("Total Price: ").append(this.price).append("\n");
            billGenerated = true;
        }
        return bill.toString();
    }
}
