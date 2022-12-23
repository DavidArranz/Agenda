package com.example.agenda;

import android.graphics.Bitmap;

public class Contact {
    private String nombre;
    private String tel;
    private String correo;
    private Bitmap img;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public Contact(String nombre, String tel, String correo,Bitmap img) {
        this.nombre = nombre;
        this.tel = tel;
        this.correo = correo;
        this.img = img;

    }
}
