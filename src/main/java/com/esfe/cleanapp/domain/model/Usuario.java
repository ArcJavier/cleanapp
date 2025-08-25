package com.esfe.cleanapp.domain.model;

public final class Usuario {
    private String nombre;
    private String email;
    private String password;
    private boolean  Estado;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String password, boolean estado) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        Estado = estado;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
