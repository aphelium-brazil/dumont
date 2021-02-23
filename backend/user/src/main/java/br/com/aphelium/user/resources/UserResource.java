package br.com.aphelium.user.resources;

import br.com.aphelium.user.entities.Users;
import br.com.aphelium.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/users")
public class UserResource {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public ResponseEntity<List<Users>> findAll(){
        List<Users> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id){
        Users obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}
