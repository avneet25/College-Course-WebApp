package com.ca.college.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coop.course.pojo.ProgramType;
import com.coop.course.service.ProgramTypeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProgramTypeTest {
	
	@Autowired
	private ProgramTypeService programTypeService;
	
	@Test
	public void testSelectAll() {
		List<ProgramType> programTypes = programTypeService.selectAll();
		programTypes.forEach(pt -> System.out.println(pt));
	}

}
