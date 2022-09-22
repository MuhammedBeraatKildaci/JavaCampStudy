public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "Laptop", "Asus Laptop", 5500, 3, "gold");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());
    }
}
