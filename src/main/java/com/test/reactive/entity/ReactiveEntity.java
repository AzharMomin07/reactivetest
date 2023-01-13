package com.test.reactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person")
public class ReactiveEntity {
    @Id
    private Long id;
    @Column("firstname")
    private String firstName;
    @Column("lastname")
    private String lastName;
}
