package com.example.aplicacionaantah.Entidades;

import com.example.aplicacionaantah.Entidades.Mensaje;

public class MensajeRecibir extends Mensaje {
    private Long hora;

    public MensajeRecibir() {
    }

    public MensajeRecibir(Long hora) {
        this.hora = hora;
    }

    public MensajeRecibir(String mensaje, String nombre, String fotoPerfil, String type_mensaje, String hora, String urlFoto, Long hora1) {
        super(mensaje, nombre, fotoPerfil, type_mensaje, hora, urlFoto);
        this.hora = hora1;
    }

    public Long getHora() {
        return hora;
    }

    public void setHora(Long hora) {
        this.hora = hora;
    }
}
