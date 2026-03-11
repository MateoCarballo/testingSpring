package com.example.Ej501;

import com.example.Ej501.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludo")
public class SaludoController {

    private final SaludoService saludoService;

    @Autowired
    public SaludoController(SaludoService saludoService) {
        this.saludoService = saludoService;
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<String> saludar(@PathVariable String nombre) {
        String saludo = saludoService.saludarUsuario(nombre);
        return ResponseEntity.ok(saludo);
    }
}
