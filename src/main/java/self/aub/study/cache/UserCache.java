package self.aub.study.cache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by liujinxin on 16/8/16.
 */
@Component
public class UserCache {


    @Cacheable(value = "user", key = "'demoInfo_'+#id")
    public int getName(String id) {
        return new Random().nextInt(20);
    }

    @CacheEvict(value = "user", allEntries = true)
    public void clean() {

    }
}
