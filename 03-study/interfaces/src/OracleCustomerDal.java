public class OracleCustomerDal implements CustomerDal,Repository {

    @Override
    public void add() {
        System.out.println("Oracle veri tabanına eklendi");
    }
    
}
