package com.example.aplicacionaantah.Entidades;

import com.example.aplicacionaantah.Entidades.Mensaje;

import java.util.Map;

public class MensajeEnviar extends Mensaje {
    private Map hora;

    public MensajeEnviar() {
    }

    public MensajeEnviar(Map hora) {
        this.hora = hora;
    }

    public MensajeEnviar(String mensaje, String nombre, String fotoPerfil, String type_mensaje, String hora, Map hora1) {
        super(mensaje, nombre, fotoPerfil, type_mensaje, hora);
        this.hora = hora1;
    }

    public MensajeEnviar(String mensaje, String nombre, String fotoPerfil, String type_mensaje, String hora, String urlFoto, Map hora1) {
        super(mensaje, nombre, fotoPerfil, type_mensaje, hora, urlFoto);
        this.hora = hora1;
    }

    public Map getHora() {
        return hora;
    }

    public void setHora(Map hora) {
        this.hora = hora;
    }
}

