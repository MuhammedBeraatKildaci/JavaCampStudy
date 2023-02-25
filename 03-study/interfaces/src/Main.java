public class Main {
    public static void main(String[] args) throws Exception {
        CustomerDal customerDal = new MysqlCustomerDal();
        customerDal.add();
    }
}
