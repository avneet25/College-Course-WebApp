package com.coop.course.managedbeans;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.apache.ibatis.javassist.SerialVersionUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.coop.course.pojo.DeliveryFormat;
import com.coop.course.pojo.Program;
import com.coop.course.service.ProgramService;

//@Component
//@ManagedBean(name = "programBean")
@Controller("programBean")
@SessionScoped
public class ProgramBean implements Serializable{
	
	private static final long serialVersionUID = -8272178220581107728L;

	
	private List<Program> programs;
	
	public List<Program> getPrograms() { 
		return programs;
	}
	 
	public void setPrograms(List<Program> programs) {
		this.programs = programs;
	}

	//this onload gets the value from the database and inject it to the programs
	public void onload() {
		//service
	}
	

}




