package com.molina.estudiantes;

import com.molina.estudiantes.user.User;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCRUDRepository extends CrudRepository<Productos, Integer> {
}
