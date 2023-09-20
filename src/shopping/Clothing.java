/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

/**
 *
 * @author Fungho Baloyi - ST10405022
 */
public class Clothing extends Product {
    
    public Clothing(String productId, String productName, double price)
    {
        super(productId, productName, price);
    }
        
    @Override
    public double calculateDiscount()
    {
        return price*0.1;
    }
    
    @Override
    public double calculateShippingCost()
    {
        return 2.50*productWeight(this.weight) + 3.50*productDestination(this.distance);
    }
    
    public double productWeight(double weight)
    {
        this.weight = weight;
        return weight;
    }
    
    public double productDestination(double distance)
    {
        this.distance = distance;
        return distance;
    }
}
