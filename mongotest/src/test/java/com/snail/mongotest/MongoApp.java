package com.snail.mongotest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.Mongo;
import com.splatform.mongotest.model.Person;

/**
 * <p>
 * descrption:
 * </p>
 * 
 * @author fuzl
 * @date 2015年4月17日
 */
public class MongoApp {

	private static final Log log = LogFactory.getLog(MongoApp.class);

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

		log.info("开始启动mongodb测试");  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/META-INF/applicationContext.xml");  
		
        MongoTemplate mongoTemplate = (MongoTemplate) ctx.getBean("mongoTemplate");
        
		//MongoOperations mongoOps = mongoTemplate.ge//new MongoTemplate(new Mongo(), "myTest");

        mongoTemplate.insert(new Person("Joe", 34));

		log.info("查询结果:"+mongoTemplate.findOne(new Query(Criteria.where("name").is("Joe")),Person.class));

		mongoTemplate.dropCollection("person");
		
	}

}
