package com.molina.estudiantes.list;

import com.molina.estudiantes.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list")
public class ListEndPoints {
    @Autowired
    private ListCrudRepository listCrudRepository;
    @GetMapping()
    public String hola(){
        return "hola spring java";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<ListTable> getAllUsers() {
        // This returns a JSON or XML with the users
        return listCrudRepository.findAll();
    }
}
