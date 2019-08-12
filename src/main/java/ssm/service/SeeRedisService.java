package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import ssm.pojo.Actor;
import ssm.pojo.Director;
import ssm.pojo.Movies;

import java.util.List;
import java.util.logging.Logger;

@Service
public class SeeRedisService{

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    JedisConnectionFactory jedisConnectionFactory;

    private Logger logger = Logger.getLogger(String.valueOf(SeeRedisService.class));


    public void add(String key, String value) {
        jedisConnectionFactory.setDatabase(1);
        if(redisTemplate == null){
            logger.warning("redis实例化失败");
            return;
        }else
            redisTemplate.opsForValue().set(key,value);
    }

    public void addObj(String objectKey, String key, Movies object) {
        jedisConnectionFactory.setDatabase(1);
        if(redisTemplate == null){
            logger.warning("redis实例化失败");
            return;
        }else
            redisTemplate.opsForHash().put(objectKey,key,object);
    }

    public void addObj(String objectKey, String key, Actor object) {
        jedisConnectionFactory.setDatabase(1);
        if(redisTemplate == null){
            logger.warning("redis实例化失败");
            return;
        }else
            redisTemplate.opsForHash().put(objectKey,key,object);
    }

    public void addObj(String objectKey, String key, Director object) {
        jedisConnectionFactory.setDatabase(1);
        if(redisTemplate == null){
            logger.warning("redis实例化失败");
            return;
        }else
            redisTemplate.opsForHash().put(objectKey,key,object);
    }

    public void delete(String key) {
        jedisConnectionFactory.setDatabase(1);
        if(redisTemplate == null){
            logger.warning("redis实例化失败");
            return;
        }else
            redisTemplate.delete(key);
    }

    public void delete(List<String> listKeys) {
        jedisConnectionFactory.setDatabase(1);
    }

    public void deletObj(String objecyKey, String key) {
        jedisConnectionFactory.setDatabase(1);
    }

    public void update(String key, String value) {
        jedisConnectionFactory.setDatabase(1);
    }

    public void updateObj(String objectKey, String key, Movies object) {
        jedisConnectionFactory.setDatabase(1);
    }

    public String get(String key) {
        jedisConnectionFactory.setDatabase(1);
        String value = (String) redisTemplate.opsForValue().get(key);
        return value;
    }

    public Object getObj(String objectKey, String key) {
        jedisConnectionFactory.setDatabase(1);
        Object object = redisTemplate.opsForHash().get(objectKey,key);
        return object;
    }
}
