import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Solution {

        public static void main(String[] args) {
            SqlSessionFactory sqlSessionFactory;
           Mapper subscriberMapper;
            Reader reader = null;
            try {
                reader = Resources
                        .getResourceAsReader("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
                subscriberMapper = sqlSessionFactory.openSession().getMapper(Mapper.class); 
               MyBatis myBatis = subscriberMapper.getMyBatisById(1);
                List<MyBatis> myBatises = subscriberMapper.getMyBatis();
                System.out.println(myBatises.get(1).getDescription());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

