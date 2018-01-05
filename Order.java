import java.util.ArrayList;
public class Order<E> implements IOrder<E>{
    private TrackingNumber trackingNumber;
    private ArrayList<E> order;
    private ArrayList<E> archivedOrders;
    
    public void delete(){
        
        
        
    }
    
    public E archive(E order){
        
        return null;
    }
    
    public void update(Customer customer){
        
        
    }
    
    public boolean reOrder(E order){
        
        return false;
    }
    
    public E track(E order){
        
        return null;
    }
    
    public E viewDetails(E order){
        
        return null;
    }
    
    public boolean cancel(E order){
        
        
       return false;
    }
    
    public boolean returnOrder(E order){
        
        return false;
    }
}