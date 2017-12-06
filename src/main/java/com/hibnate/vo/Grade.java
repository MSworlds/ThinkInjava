package com.hibnate.vo;

import java.util.Set;

/**
 * Created by Administrator on 2017/12/6.
 */
public class Grade {
    private  Integer id;
    private String name;
    private Set<Teacher> teacher;

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

    public Set<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(Set<Teacher> teacher) {
        this.teacher = teacher;
    }
}
