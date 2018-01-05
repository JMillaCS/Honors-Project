public interface IOrder<E>{
    
    public void delete();
    
    public E archive(E order);
    
    public void update(Customer customer);
    
    public boolean reOrder(E order);
    
    public E track(E order);
    
    public E viewDetails(E order);
    
    public boolean cancel(E order);
    
    public boolean returnOrder(E order);
}