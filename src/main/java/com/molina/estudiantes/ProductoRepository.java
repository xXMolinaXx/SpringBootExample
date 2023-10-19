package com.molina.estudiantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductoRepository {
    @Autowired
    private ProductoCRUDRepository productoCRUDRepository;
    public List<Productos> getAll() { return (List<Productos>) productoCRUDRepository.findAll(); }
}
