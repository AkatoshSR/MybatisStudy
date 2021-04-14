package com.sqx.Pojo;


public class Student {

    private int id;
    private String name;
    private int tId;

    private Teacher teacher;

    public Student() {
    }

    public Student(int id, String name, int tId) {
        this.id = id;
        this.name = name;
        this.tId = tId;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getTId() {
        return tId;
    }

    public void setTId(int tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tId=" + tId +
                ", teacher=" + teacher +
                '}';
    }
}
