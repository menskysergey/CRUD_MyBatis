import java.util.List;

public interface Mapper {
    MyBatis getMyBatisById(Integer id);
    List<MyBatis> getMyBatis();
}
