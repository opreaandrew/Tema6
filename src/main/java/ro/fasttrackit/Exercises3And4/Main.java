package ro.fasttrackit.Exercises3And4;

public class Main {
    public static void main(String[] args){
        Product product1 = new Product("Laptop", 999.99, 5, "Electronics");
        Product product2 = new Product("Book", 15.99, 20, "Books");
        Product product3 = new Product("Shoes", 49.99, 0, "Fashion");

        // Use the methods of the Product objects
        System.out.println("Product 1 - Name: " + product1.getName() + ", Price: " + product1.getPrice() +
                ", Quantity: " + product1.getQuantity() + ", Category: " + product1.getCategory() +
                ", Has Stock: " + product1.hasStock() + ", Is Electronics: " + product1.isCategory("Electronics"));

        System.out.println("Product 2 - Name: " + product2.getName() + ", Price: " + product2.getPrice() +
                ", Quantity: " + product2.getQuantity() + ", Category: " + product2.getCategory() +
                ", Has Stock: " + product2.hasStock() + ", Is Electronics: " + product2.isCategory("Electronics"));

        System.out.println("Product 3 - Name: " + product3.getName() + ", Price: " + product3.getPrice() +
                ", Quantity: " + product3.getQuantity() + ", Category: " + product3.getCategory() +
                ", Has Stock: " + product3.hasStock() + ", Is Electronics: " + product3.isCategory("Electronics"));
    }
}
