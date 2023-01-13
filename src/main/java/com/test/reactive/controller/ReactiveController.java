package com.test.reactive.controller;

import com.test.reactive.entity.ReactiveEntity;
import com.test.reactive.service.ReactiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveController {
    @Autowired
    private ReactiveService reactiveService;

    @PostMapping("/persons")
    public Mono<ReactiveEntity> createPerson(@RequestBody ReactiveEntity reactiveEntity) {
        return reactiveService.createPerson(reactiveEntity);
    }
    @GetMapping("/persons")
    public Flux<ReactiveEntity> getAll(){
        return this.reactiveService.getAllPersons();
    }

    @GetMapping("/persons/{id}")
    public Mono<ReactiveEntity> getById(@PathVariable Long id) {
        return reactiveService.getById(id);
    }

}
