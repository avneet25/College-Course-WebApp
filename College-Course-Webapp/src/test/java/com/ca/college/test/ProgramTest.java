package com.ca.college.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ca.college.mapper.ProgramMapper;
import com.coop.course.pojo.DeliveryFormat;
import com.coop.course.pojo.Program;
import com.coop.course.pojo.ProgramType;
import com.coop.course.service.ProgramService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProgramTest {
	private ApplicationContext applicationContext;
	
	@Autowired
	private ProgramService programService;

	@Test
	public void testSelectAll() {
		
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProgramService programService = applicationContext.getBean("programService",ProgramService.class);
		
		List<Program> programs = programService.selectAll();
		System.out.println("========================");
		programs.forEach(p -> System.out.println(p));
		
	}
	
	@Test
	public void testSelectAllWithTestAnnotation() {
		
		//applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ProgramService programService = applicationContext.getBean("programService",ProgramService.class);
		
		List<Program> programs = programService.selectAll();
		System.out.println("========================");
		programs.forEach(p -> System.out.println(p));
		
	}
	
	@Test
	public void testSelectByProgramId() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProgramService programService = applicationContext.getBean("programService",ProgramService.class);
		
		int programId = 13;
		Program program = programService.selectByProgramId(programId);
		System.out.println("========================");
		System.out.println(program);
	}
	
	@Test
	public void testSelectByProgramIdWithTestAnnotation() {
		//applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ProgramService programService = applicationContext.getBean("programService",ProgramService.class);
		
		int programId = 13;
		Program program = programService.selectByProgramId(programId);
		System.out.println("========================");
		System.out.println(program);
	}
	
	@Test
	public void testSaveOrUpdateToSave() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProgramService programService = applicationContext.getBean("programService",ProgramService.class);
		
		ProgramType programType = new ProgramType(2, "Business");
		
		DeliveryFormat df1 = new DeliveryFormat(1, "Full in-person delivery");
		DeliveryFormat df2 = new DeliveryFormat(2, "Full online delivery");
		DeliveryFormat df3 = new DeliveryFormat(3, "Combination of in-person and online (hybrid)");
		List<DeliveryFormat> dfs = new ArrayList<>();
		dfs.add(df1);
		dfs.add(df2);
		dfs.add(df3);
		
		
		Program program = new Program();
		program.setName("Computer Science");
		program.setInstructionHours(200);
		program.setProgramType(programType);
		program.setOffsiteWorkPracticum('1');
		program.setDeliveryFormats(dfs);
		
		programService.saveOrUpdate(program);
		
		System.out.println("========================");
		
	}
	
	@Test
	public void testSaveOrUpdateToUpdate() {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProgramService programService = applicationContext.getBean("programService",ProgramService.class);
		
		ProgramType programType = new ProgramType(2, "Business");
		
		DeliveryFormat df1 = new DeliveryFormat(1, "Full in-person delivery");
		DeliveryFormat df2 = new DeliveryFormat(2, "Full online delivery");
		DeliveryFormat df3 = new DeliveryFormat(3, "Combination of in-person and online (hybrid)");
		List<DeliveryFormat> dfs = new ArrayList<>();
		dfs.add(df1);
		dfs.add(df2);
		dfs.add(df3);
		
		
		Program program = new Program();
		program.setProgramId(16);
		program.setName("Art");
		program.setInstructionHours(200);
		program.setProgramType(programType);
		program.setOffsiteWorkPracticum('1');
		program.setDeliveryFormats(dfs);
		
		programService.saveOrUpdate(program);
		
		System.out.println("========================");
		
	}
	

}
