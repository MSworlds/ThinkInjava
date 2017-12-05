package com.hibnate.vo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/12/5.
 */
public class Student {
    private Integer id;
    private String name;
    private Integer sex;

    /*集合*/
    private Set<String> adress;
    private List<String> adress2;
    Map<String,String> adress3;

    public Map<String, String> getAdress3() {
        return adress3;
    }

    public void setAdress3(Map<String, String> adress3) {
        this.adress3 = adress3;
    }

    public List<String> getAdress2() {
        return adress2;
    }

    public void setAdress2(List<String> adress2) {
        this.adress2 = adress2;
    }

    public Set<String> getAdress() {
        return adress;
    }

    public void setAdress(Set<String> adress) {
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
