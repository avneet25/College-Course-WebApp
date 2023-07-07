package com.coop.course.pojo;

import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Program {
	
	private Integer programId;
	private String name;
	private Integer instructionHours;
	private Character offsiteWorkPracticum;
	
	// Many - One
	private ProgramType programType;
	
	// Many - Many
	private List<DeliveryFormat> deliveryFormats;
	
	public Program() {
		super();
	}
	
	// Constructor without programId --> auto-increment
	public Program(String name, Integer instructionHours, Character offsiteWorkPracticum, ProgramType programType,
			List<DeliveryFormat> deliveryFormats) {
		super();
		this.name = name;
		this.instructionHours = instructionHours;
		this.offsiteWorkPracticum = offsiteWorkPracticum;
		this.programType = programType;
		this.deliveryFormats = deliveryFormats;
	}

	public Program(Integer programId, String name, Integer instructionHours, Character offsiteWorkPracticum,
			ProgramType programType, List<DeliveryFormat> deliveryFormats) {
		super();
		this.programId = programId;
		this.name = name;
		this.instructionHours = instructionHours;
		this.offsiteWorkPracticum = offsiteWorkPracticum;
		this.programType = programType;
		this.deliveryFormats = deliveryFormats;
	}

	public Integer getProgramId() {
		return programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getInstructionHours() {
		return instructionHours;
	}

	public void setInstructionHours(Integer instructionHours) {
		this.instructionHours = instructionHours;
	}

	public Character getOffsiteWorkPracticum() {
		return offsiteWorkPracticum;
	}

	public void setOffsiteWorkPracticum(Character offsiteWorkPracticum) {
		this.offsiteWorkPracticum = offsiteWorkPracticum;
	}

	public ProgramType getProgramType() {
		return programType;
	}

	public void setProgramType(ProgramType programType) {
		this.programType = programType;
	}

	public List<DeliveryFormat> getDeliveryFormats() {
		return deliveryFormats;
	}

	public void setDeliveryFormats(List<DeliveryFormat> deliveryFormats) {
		this.deliveryFormats = deliveryFormats;
	}
	
	
	@Override
	public String toString() {
		return "Program [programId=" + programId + ", name=" + name + ", instructionHours=" + instructionHours
				+ ", offsiteWorkPracticum=" + offsiteWorkPracticum + ", programType=" + programType
				+ ", deliveryFormats=" + deliveryFormats + "]";
	}


	
	










	
	

}
