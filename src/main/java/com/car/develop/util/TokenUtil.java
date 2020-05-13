package com.car.develop.util;

import com.car.develop.exception.BankException;
import com.car.develop.mapper.UserMapper;
import com.car.develop.model.User;
import com.car.develop.model.UserExample;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component
public class TokenUtil {

    @Resource
    RedisTemplate redisTemplate;

    @Resource
    UserMapper userMapper;

    public String createToken(String mobile) {
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        HashOperations hashOperations = redisTemplate.opsForHash();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andMobileEqualTo(mobile);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.isEmpty()){
            throw new BankException("999999","数据异常，请重试");
        }
        hashOperations.put("token", token, users.get(0).getId());
        redisTemplate.expire(token, 7, TimeUnit.DAYS);
        return token;
    }

    public boolean isTokenValid(String token) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        if (hashOperations.get("token", token) == null) {
            return false;
        }
        return true;
    }

    public void deleteToken(String token) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.delete("token",token);
    }

    public String getUserIdByToken(String token) {
        HashOperations hashOperations = redisTemplate.opsForHash();
        return (String)hashOperations.get("token",token);
    }
}
