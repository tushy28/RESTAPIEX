package com.tushy.restapiex.entity;


import lombok.Data;

import javax.persistence.*;

@Table(name="TASK")
@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String description;
    private Integer priority;

}
