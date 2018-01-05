public class CreditCard implements IPaymentMethod{
  private String name;
  private String cardNumber;
  private String bankORcreditUnion;
  
  public CreditCard(String name, String cardnumber, String bankORcreditUnion){
   setName(name);
   setCardNumber(cardNumber);
   setBank(bankORcreditUnion);
  }
    
  public void setName(String name){
    this.name = name;
    }
  
  public void setCardNumber(String cardNumber){
    
    }
  
  public void setCVV(String cvv){
    
    }
  
  public void setExpirationDate(String expirationDate){
    
    }
  
  public void setBank(String bankORcreditUnion){
   this.bankORcreditUnion = bankORcreditUnion;   
    }
}