package com.example.Group3.HelloWorld.Model;

import javax.persistence.*;

@Entity
@Table(name = "Result")
public class HelloWorld {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "result")
    private String result;

    public HelloWorld() {
    }

    public HelloWorld(String result) {
        this.result = result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
