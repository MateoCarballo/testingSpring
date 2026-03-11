package com.example.Ej501;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saludarUsuario(String nombre) {
        return "¡Hola, " + nombre + "!";
    }
}
