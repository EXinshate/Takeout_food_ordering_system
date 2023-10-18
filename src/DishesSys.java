import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class DishesSys implements DAO<Dishes>{
    static Map <String, Dishes> dishesmap = new HashMap<>();
    Set <String> keys = dishesmap.keySet();

    public void insert(Dishes t){
        dishesmap.put(t.getdID(), t);
    }

    public Dishes findById(String id){
        if (dishesmap.get(id) == null){
            return null;
        }else {
            return dishesmap.get(id);
        }
    }

    @Override
    public List<Order> findByuId(String uid) {
        return null;
    }

    @Override
    public List<Dishes> findAll() {
        return null;
    }

    public List<Dishes> findByType(String type){
        List<Dishes> list = new ArrayList<>();
        for (String str : keys){
            list.add(dishesmap.get(str));
        }
        return list;
    }
    public void selectBytype(String typename){
        int count = 0;
        for(String key : keys){
            if (Objects.equals(dishesmap.get(key).getDtype(), typename)){
                System.out.println(dishesmap.get(key));
                count++;
            }
        }
        if (count == 0){
            System.out.println("没有当前类别的菜品!");
        }
    }
    public void delete(String id){
        if (dishesmap.get(id) == null){
            System.out.println("输入id错误...");
        }else {
            dishesmap.remove(id);
        }
    }
}
