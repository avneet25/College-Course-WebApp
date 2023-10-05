package com.coop.course.pojo;

public class ProgramType {
	
	private Integer programTypeId;
	private String type;
	
	public ProgramType() {
		super();
	}
	
	public ProgramType(Integer programTypeId, String type) {
		super();
		this.programTypeId = programTypeId;
		this.type = type;
	}
	
	public Integer getProgramTypeId() {
		return programTypeId;
	}
	
	public void setProgramTypeId(Integer programTypeId) {
		this.programTypeId = programTypeId;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ProgramType [programTypeId=" + programTypeId + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((programTypeId == null) ? 0 : programTypeId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgramType other = (ProgramType) obj;
		if (programTypeId == null) {
			if (other.programTypeId != null)
				return false;
		} else if (!programTypeId.equals(other.programTypeId))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	

	
	

}
