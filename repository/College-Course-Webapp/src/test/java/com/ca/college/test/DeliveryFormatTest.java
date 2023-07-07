package com.ca.college.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coop.course.pojo.DeliveryFormat;
import com.coop.course.service.DeliveryFormatService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = "classpath:applicationContext.xml") //config file
public class DeliveryFormatTest {

	@Autowired
	private DeliveryFormatService deliveryFormatService;
	
	@Test
	public void testselectAll() {
		List<DeliveryFormat> deliveryFormats = deliveryFormatService.selectAll();
		deliveryFormats.forEach(pt -> System.out.println(pt));
	}
	
	
}
