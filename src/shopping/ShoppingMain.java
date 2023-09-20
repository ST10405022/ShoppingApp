/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopping;

/**
 *
 * @author Fungho Baloyi - ST10405022
 */
public class ShoppingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product[] newProducts = new Product[3];
        newProducts[0] = new Electronics("SON1045", "Sony DLX5000", 8999.99);
        newProducts[0].productWeight(1.20);
        newProducts[0].productDestination(25);
        
        newProducts[1] = new Clothing("NIK2565","Nike 2020s",2999.99);
        newProducts[1].productWeight(0.60);
        newProducts[1].productDestination(25);
        
        newProducts[2] = new Electronics("ALW5696","AlienWare 20s",19999.99);
        newProducts[2].productWeight(1.60);
        newProducts[2].productDestination(25);
        
        Cart newCart = new Cart();
        
        CartItem item0 = new CartItem(newProducts[0],1);
        newCart.addItem(item0);
        
        CartItem item1 = new CartItem(newProducts[1],3);
        newCart.addItem(item1);
        
        CartItem item2 = new CartItem(newProducts[2],1);
        newCart.addItem(item2);
        System.out.println("Total cost of cart is: R"+String.format("%.2f", newCart.calculateTotalCost()));
    }
    
}
