package com.glima.androidstudy.model;

/**
 * Created by gustavo on 29/06/16.
 */
public class FormObject {

    private String name;
    private String mail;
    private String password;

    public FormObject() {
    }

    private FormObject(String name, String mail, String password) {
        this.name = name;
        this.mail = mail;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
