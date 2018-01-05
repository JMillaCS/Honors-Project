public class DebitCard implements IPaymentMethod{
  private String name;
  private String cardNumber;
  private String cvv;
  private String expirationDate;
  private String bank;
  
  public DebitCard(String name, String cardnumber, String cvv, String eDate, String bank){
   setName(name);
   setCardNumber(cardNumber);
   setCVV(cvv);
   setExpirationDate(eDate);
   setBank(bank);
  }
    
  public void setName(String name){
    this.name = name;
    }
  
  public void setCardNumber(String cardNumber){
    this.cardNumber = cardNumber;
    }
  
  public void setCVV(String cvv){
    this.cvv = cvv;
    }
  
  public void setExpirationDate(String expirationDate){
    this.expirationDate = expirationDate;
    }
  
  public void setBank(String bank){
   this.bank = bank;   
    }
}