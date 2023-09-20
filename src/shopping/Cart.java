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
public class Cart {
    private ArrayList<CartItem> items; 
    private Product product;
    private ArrayList<Product> ducts;
    
    public Cart()
    {
        items = new ArrayList();
    }
    
    public void addItem(CartItem item)
    {
        items.add(item);
        product = item.product();
    }
    
    public double calculateTotalCost()
    {
        double total=0.0;
        for(CartItem item : items)
        {
            total += (item.totalCost()+product.calculateShippingCost());
        }
        return total;
    }
    
    public void checkOut()
    {
        if(!items.isEmpty())
        {
            for(CartItem item : items)
            {
                items.remove(item);
            }
        }
    }
}
