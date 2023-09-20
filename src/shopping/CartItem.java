/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

import java.util.ArrayList;

/**
 *
 * @author Fungho Baloyi - ST10405022
 */
public class CartItem {
    private Product product;
    private int quantity;
    
    public CartItem(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }
    
    public double totalCost()
    {   
        return (product.price - product.calculateDiscount())*quantity;
    }
    
    public Product product()
    {
        return this.product;
    }
    
}
