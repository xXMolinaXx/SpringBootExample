package com.molina.estudiantes.controllers;

import com.molina.estudiantes.ProductoRepository;
import com.molina.estudiantes.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/productos")
public class ProductosController {
    @Autowired
    private ProductoRepository productoRepository;
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Productos> getAllUsers() {
        // This returns a JSON or XML with the users
        return productoRepository.getAll();
    }
    @GetMapping(path="/hola/{nombre}")
    public @ResponseBody String saludar(@PathVariable("nombre") String nombre) {
        // This returns a JSON or XML with the users
        return "hola compa" + nombre;
    }
    @PostMapping(path = "post")
    public String postMethd(@RequestBody() String hola){
        return hola;
    }
}
