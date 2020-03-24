
package com.mycompany.Modelo;

public class Usuario {
    private String nombre,usuario,pass,email;
    
    public Usuario(){
    
    }

    public Usuario(String nombre, String usuario, String pass, String email) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.pass = pass;
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }
    
    
}
