import java.util.List;

public interface DAO<T> {
    void insert(T t);
    T findById(String id);

    List<Order> findByuId(String uid);

    List<T> findAll();
    void delete(String id);
}
