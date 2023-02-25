public class Main {
    public static void main(String[] args) throws Exception {
        ProductManager manager = new ProductManager();
        Product product = new Product(1,"mouse",1000);
        manager.add(product);

        //inner class examples
        DatabaseHelper.Crud.add();
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Crud.list();
        DatabaseHelper.Crud.update();
        DatabaseHelper.Connection.connect();
    }
}
