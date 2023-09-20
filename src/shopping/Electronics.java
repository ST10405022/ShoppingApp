/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

/**
 *
 * @author Fungho Baloyi - ST10405022
 */
public class Electronics extends Product {
    
    public Electronics(String productId, String productName, double price)
    {
        super(productId, productName, price);
    }
    
    @Override
    public double calculateDiscount()
    {
        return price*0.05;
    }
    
    @Override
    public double calculateShippingCost()
    {
        return 4.00*productWeight(this.weight) + 4.50*productDestination(this.distance);
    }
    
    @Override
    public double productWeight(double weight)
    {
        this.weight = weight;
        return weight;
    }
    
    @Override
    public double productDestination(double distance)
    {
        this.distance = distance;
        return distance;
    }
}
