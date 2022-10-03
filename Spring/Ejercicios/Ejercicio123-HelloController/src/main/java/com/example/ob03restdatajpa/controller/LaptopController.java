package com.example.ob03restdatajpa.controller;

import com.example.ob03restdatajpa.entities.Laptop;
import com.example.ob03restdatajpa.repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository repository;


    public LaptopController(LaptopRepository repository) {
        this.repository = repository;
    }

    // CrUD sobre la entidad Laptop
    // Buscar Laptops
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        // recuperar y devolver laptops
        return repository.findAll();
    }
    // Buscar laptop
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
        Optional<Laptop> laptopOpt = repository.findById(id);
        //opcion1
        if (laptopOpt.isPresent())
            return ResponseEntity.ok(laptopOpt.get());
        else
            return ResponseEntity.notFound().build();
        //opcion2
/*        return laptopOpt.orElse(null);*/

    }

    // Crear Laptop
    @PostMapping("/api/laptop")
    public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){

        System.out.println(headers.get("User-Agent"));
        return repository.save(laptop);
    }

}
