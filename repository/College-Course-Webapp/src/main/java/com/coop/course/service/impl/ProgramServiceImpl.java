package com.coop.course.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ca.college.mapper.ProgramMapper;
import com.coop.course.pojo.Program;
import com.coop.course.service.ProgramService;

@Transactional
@Service("programService")
public class ProgramServiceImpl implements ProgramService {

	@Override
	public List<Program> selectAll() {
		
		return null;
	}


}
