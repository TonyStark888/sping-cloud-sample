package org.redis.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hy.sample.redis.dao.Application;
import com.hy.sample.redis.dao.RedisDao;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AppTest {
	
	@Test
	public void contextLoads() {
		
	}
	
	@Autowired
	RedisDao redisDao;
	
	@Test
	public void test() {
		redisDao.setKey("mykey", "love");
		redisDao.setKey("mykey1", "love you");
		System.out.println(redisDao.getValue("mykey"));
		System.out.println(redisDao.getValue("mykey1"));
	}
}
