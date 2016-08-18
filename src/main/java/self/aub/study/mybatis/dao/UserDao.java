package self.aub.study.mybatis.dao;

import org.springframework.stereotype.Repository;
import self.aub.study.mybatis.po.UserPo;

@Repository
public class UserDao extends BaseDao {


    public UserPo selectByIdReader(Integer id) {
        return sqlSessionReader.selectOne("UserPo.selectById", id);
    }

    public UserPo selectByIdWriter(Integer id) {
        return sqlSessionWiter.selectOne("UserPo.selectById", id);
    }


    public void insert1(UserPo userPo) {
        sqlSessionWiter.insert("UserPo.insert", userPo);
    }

    public void insert2(UserPo userPo) {
        //throw  new RuntimeException("11");
        sqlSessionWiter.insert("UserPo.insert", userPo);
    }


}
