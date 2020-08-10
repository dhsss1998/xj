package jee.support.entity;

import java.util.List;

public class Show {
    private int code=0;
    private int  count=1000;
    private  String msg="";
    List<Reward> data;

    public List<Reward> getData() {
        return data;
    }

    public void setData(List<Reward> data) {
        this.data = data;
    }
}
