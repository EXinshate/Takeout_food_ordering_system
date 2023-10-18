import java.util.*;

public class OrderSys implements DAO<Order> {
    static Map<String, Order> orderMap = new HashMap<>();
    static List<Order> orderList = new ArrayList<>();
    public void insert(Order t){
        orderMap.put(t.getOrderID(), t);

    }
    public Order findById(String id){
        if (orderMap.get(id) == null){
            return null;
        } else {
            return orderMap.get(id);
        }
    }

    @Override
    public List<Order> findByuId(String uid) {
        List<Order> list = new ArrayList<>();
        Set <String> Keys = orderMap.keySet();
        for (String key: Keys) {
            if (Objects.equals(uid, orderMap.get(key).getuID())){
                list.add(orderMap.get(key));
            }
        }
        return list;
    }

    public List<Order> findAll(){
        Set<String> Keys = orderMap.keySet();
        for(String key : Keys){
            orderList.add(orderMap.get(key));
        }
        return orderList;
    }

    public void delete(String id){

    }
}
