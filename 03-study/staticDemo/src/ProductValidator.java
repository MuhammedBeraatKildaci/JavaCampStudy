public class ProductValidator {

    static{
        System.out.println("static yapıcı block çalıştı");
    }
    
    public ProductValidator() {
        System.out.println("yapıcı block çalıştı");
    }

    public static boolean isValid(Product product) {
        if (product.price>0 && !product.name.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){
        
    }
        
}
