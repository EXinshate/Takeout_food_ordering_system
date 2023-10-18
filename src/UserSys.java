import java.util.*;

public class UserSys implements DAO<User>{
    static Map<String, User> userMap = new HashMap<>();
    List<User> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void insert (User t){
        userMap.put(t.getuID(), t);
    }

    public List<User> findAll(){
        Set<String> keys = userMap.keySet();
        for (String str : keys){
            list.add(userMap.get(str));
        }
        return list;
    }

    public void delete(String id){
        if(userMap.get(id) == null){
            System.out.println("没有当前id的客户");
        }else {
            System.out.println(userMap.get(id) + "已删除！！！");
            userMap.remove(id);
        }
    }

    public void changepwd(String id){
        User user = findById(id);
        System.out.println("请输入新密码： ");
        String str = sc.next();
        User t = new User(user.getuID(), user.getUname(), user.getUsex(), str, user.getUaddress(),
                user.getUtel(), user.getuTime());
        userMap.put(id, t);
    }

    @Override
    public User findById(String id) {
        if (userMap.get(id) == null){
            return null;
        }else {
            return userMap.get(id);
        }
    }

    @Override
    public List<Order> findByuId(String uid) {
        return null;
    }
}
