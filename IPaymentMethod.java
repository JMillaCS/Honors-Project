
public interface IPaymentMethod<E>
{
  public void setName(String name);
  
  public void setCardNumber(String cardNumber);
  
  public void setCVV(String cvv);
  
  public void setExpirationDate(String expirationDate);
  
  public void setBank(String bank);
}
