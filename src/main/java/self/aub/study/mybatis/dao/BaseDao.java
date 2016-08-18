package self.aub.study.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by liujinxin on 16/8/15.
 */

@Component
public class BaseDao {

    @Resource(name = "sqlSessionTemplateReader")
    protected SqlSession sqlSessionReader;


    @Resource(name = "sqlSessionTemplateWriter")
    protected SqlSession sqlSessionWiter;
}
