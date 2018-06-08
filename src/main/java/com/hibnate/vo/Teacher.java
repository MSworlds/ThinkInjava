package com.hibnate.vo;

import javax.security.auth.Subject;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2017/12/5.
 */
public class Teacher {
    private  Integer id;
    private  String name;
    private String subject;
private Set<Student> stus;

    public Set<Student> getStus() {
        return stus;
    }

    public void setStus(Set<Student> stus) {
        this.stus = stus;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



}
