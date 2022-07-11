

public class AccountData<S1,S2> {

  private final S1 customerName;
  private final S2 customerPassword;
  
  public AccountData(S1 customerName, S2 customerPassword) {
    this.customerName = customerName;
    this.customerPassword = customerPassword;
}
public S1 getCustomerName() {
  return customerName;
}

public S2 getCustomerPassword() {
  return customerPassword;
}


}