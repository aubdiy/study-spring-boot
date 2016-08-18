package self.aub.study.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Properties;

/**
 * Created by liujinxin on 16/8/16.
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableCaching
public class CacheApplication {

    @Autowired
    private UserCache userCache;


    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.setProperty("spring.config.name","app-cache");
        System.setProperties(properties);

        ConfigurableApplicationContext app = SpringApplication.run(CacheApplication.class, args);

        int name1 = app.getBean(UserCache.class).getName("20");
        System.out.println(name1);
        int name2 = app.getBean(UserCache.class).getName("20");
        System.out.println(name2);
        app.getBean(UserCache.class).clean();
        int name3 = app.getBean(UserCache.class).getName("20");
        System.out.println(name3);
    }

}
