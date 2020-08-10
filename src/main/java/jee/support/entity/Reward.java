package jee.support.entity;

import java.util.Date;

public class Reward {
    private  long studentId;
    private String name;
    private  String dateCreated;
    private  String  cellphone;
    private  String re_time;
    private  String re_note;
    private  String re_type;
    private  long rapId;

    public long getRapId() {
        return rapId;
    }

    public void setRapId(long rapId) {
        this.rapId = rapId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getRe_time() {
        return re_time;
    }

    public void setRe_time(String re_time) {
        this.re_time = re_time;
    }

    public String getRe_note() {
        return re_note;
    }

    public void setRe_note(String re_note) {
        this.re_note = re_note;
    }

    public String getRe_type() {
        return re_type;
    }

    public void setRe_type(String re_type) {
        this.re_type = re_type;
    }
}
