public class MysqlCustomerDal implements CustomerDal , Repository{

    @Override
    public void add() {
        System.out.println("Mysql veri tabanına eklendi");
    }
    
}
