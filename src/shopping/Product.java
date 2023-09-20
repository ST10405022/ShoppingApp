/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;
import java.util.*;

/**
 *
 * @author Fungho Baloyi - ST10405022
 */
public abstract class Product implements Shipping {
    protected String productId;
    protected String productName;
    protected double price;
    
    public Product(String productId, String productName, double price)
    {
        this.productId = productId;
        this.price = price;
        this.productName = productName;
    }
    
    public abstract double calculateDiscount();
    
    protected double weight = 0.0;
    protected double distance = 0.0;
    public abstract double productWeight(double weight);
    public abstract double productDestination(double distance);
}
