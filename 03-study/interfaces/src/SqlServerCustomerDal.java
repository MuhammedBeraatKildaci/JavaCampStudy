public class SqlServerCustomerDal  implements CustomerDal,Repository {

    @Override
    public void add() {
        System.out.println("Sql Server veri tabanına eklendi");
    }
    
}
