package com.spring.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {
	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		log.info("getTime() �޼��� ����");
		log.info(timeMapper.getTime());
		log.info("------------------------------------------");
		log.info("getName() �޼��� ����");
		log.info(timeMapper.getName("shs0219"));
		log.info("------------------------------------------");
		log.info("getTime2() �޼��� ����");
		log.info(timeMapper.getTime2());
		log.info("------------------------------------------");
		log.info("getSubjectName() �޼��� ����");
		log.info(timeMapper.getSubjectName("01"));
	}
}