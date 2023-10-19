package com.molina.estudiantes.list;

import com.molina.estudiantes.list.ListTable;
import org.springframework.data.repository.CrudRepository;

public interface ListCrudRepository extends CrudRepository<ListTable, Integer> {

}
