package com.example.Ej501;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String SaludarUsuario(String usuario){
        return "Hola " + usuario ;
    }
}
