package com.example.SwaggerUsql.Entity;


import javax.persistence.*;

@Entity
@Table
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fname;
    private String fphone;
    private String fstream;

    public Faculty(long id, String fname, String fphone, String fstream) {
        this.id = id;
        this.fname = fname;
        this.fphone = fphone;
        this.fstream = fstream;
    }

    public Faculty() {
        super();
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", fphone='" + fphone + '\'' +
                ", fstream='" + fstream + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public String getFstream() {
        return fstream;
    }

    public void setFstream(String fstream) {
        this.fstream = fstream;
    }
}
