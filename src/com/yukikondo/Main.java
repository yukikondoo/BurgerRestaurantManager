package com.yukikondo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger burger = new Hamburger("Brown", "Beef", 6.5, "Basic");
        burger.setAdditional1("Tomatto", 1.99);
        burger.setAdditional2("Lettece", 1.50);
        burger.setAdditional3("Bacon", 2.99);
        System.out.println("Total price is $" + burger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 7.90);
        healthyBurger.setAdditional1("Egg", 1.99);
        healthyBurger.addHealthAdditon1("Lettece", 1.50);
        System.out.println("Total price is $" + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.setAdditional1("Tomatto", 1.99);
        System.out.println("Total price is $" + deluxeBurger.itemizeHamburger());
    }
}
