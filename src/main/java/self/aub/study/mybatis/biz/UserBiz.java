package self.aub.study.mybatis.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import self.aub.study.mybatis.dao.UserDao;
import self.aub.study.mybatis.po.UserPo;

/**
 * Created by liujinxin on 16/8/15.
 */
@Service
public class UserBiz {

    @Autowired
    private UserDao userDao;

    //@Transactional
    public void tt() {
        UserPo userPo1 = new UserPo();
        userPo1.setName("insert-1");

        userDao.insert1(userPo1);

        UserPo userPo2 = new UserPo();
        userPo2.setName("insert-2");

        userDao.insert2(userPo2);
    }
}
