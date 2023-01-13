package com.test.reactive.repository;

import com.test.reactive.entity.ReactiveEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveRepository extends ReactiveCrudRepository <ReactiveEntity, Long>{

}
