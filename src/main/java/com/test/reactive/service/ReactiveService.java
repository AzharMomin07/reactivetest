package com.test.reactive.service;
import com.test.reactive.entity.ReactiveEntity;
import com.test.reactive.repository.ReactiveRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class ReactiveService{

    private final ReactiveRepository reactiveRepository;

    public ReactiveService(ReactiveRepository reactiveRepository) {
        this.reactiveRepository = reactiveRepository;
    }

    public Mono<ReactiveEntity> createPerson(ReactiveEntity reactiveEntity) {
        return reactiveRepository.save(reactiveEntity);
    }
    public Flux<ReactiveEntity> getAllPersons() {
        return reactiveRepository.findAll();
    }

    public Mono<ReactiveEntity> getById(Long id) {
        return reactiveRepository.findById(id);
    }
}

