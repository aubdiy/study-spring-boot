package self.aub.study.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import self.aub.study.mybatis.biz.UserBiz;
import self.aub.study.mybatis.dao.UserDao;

/**
 * Created by liujinxin on 16/8/15.
 */
@SpringBootApplication
@EnableTransactionManagement
//@ConfigurationProperties(locations = "classpath:app-jdbc.properties")
public class SampleXmlApplication implements CommandLineRunner {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserBiz userBiz;


    public static void main(String[] args) {
        SpringApplication.run(SampleXmlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(this.userDao.selectByIdReader(1).getName());
        //System.out.println("========");
        //System.out.println(this.userDao.selectByIdWriter(1).getName());
        userBiz.tt();
    }

}