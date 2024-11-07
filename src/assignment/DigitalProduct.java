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

class DigitalProduct extends Product {
    private double fileSize;

    public DigitalProduct(int productId, String name, double price, int quantity, double fileSize) {
        super(productId, name, price, quantity);
        this.fileSize = fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    
    @Override
    public String getInfo() {
        return super.getInfo() + ", File Size: " + fileSize + " MB";
    }
}