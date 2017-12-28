package com.hb.ex02.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GuestDaoImplTest {
	GuestDao guestDao;
	@Before
	public void setUp() throws Exception {
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("/root-context.xml");
		guestDao=(GuestDao) cntxt.getBean("guestDao");
	}

	@Test
	public void testSelectAll() throws Exception {
		assertNotNull(guestDao);
		assertTrue(guestDao.selectAll() instanceof List );
		assertTrue(guestDao.selectAll().size()>0 );
//		assertThat(actual, matcher);
		
//		fail("Not yet implemented");
	}

}
