/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;
    private List<Integer> quantities;
    private double totalAmount;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.quantities = new ArrayList<>();
        this.totalAmount = 0.0;
    }
    public void addProduct(Product product, int quantity){
        if(product.getQuantity()<quantity){
            System.out.println("Không đủ hàng trong kho");
        }else{
            product.updateQuantity(quantity);
            products.add(product);
            quantities.add(quantity);
            totalAmount += product.getPrice() * quantity;
        }
    }
    public double calculateTotal(){
        return totalAmount;
    }
    public String getOrderDetails(){
        String details = "OderId: " + orderId + "\n";
        details += "Customer: " + customer.getInfo() + "\n";
        details += "Products:\n";
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            int quantityPurchased = quantities.get(i);  
            details += " - " + product.getInfo() + ", Quantity Purchased: " + quantityPurchased + "\n";
        }
        details += "Total amount: " + totalAmount;
        return details;
    }
}
