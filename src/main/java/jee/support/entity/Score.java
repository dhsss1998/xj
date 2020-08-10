package jee.support.entity;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Transient;

import java.util.List;

@Data
@Accessors(chain = true)

public class Score {

	private long id;
	private String score;

	private	String deletestatus;
	private	String cource;



	private	String teacher;
	private	long studentId;

    Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getDeletestatus() {
		return deletestatus;
	}
	public void setDeletestatus(String deletestatus) {
		this.deletestatus = deletestatus;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
public Score(){

};
	public Score( String name,Student student,long id,long studentId,String score,String deletestatus,
			String cource,String teacher) {
		this.student=student;
this.name=name;
		this.id=id;
		this.studentId = studentId;

		this.score = score;

		this.deletestatus = deletestatus;
		this.cource = cource;
		this.teacher = teacher;

	}


}
