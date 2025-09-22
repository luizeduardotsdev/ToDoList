package com.spring_boot.todolist.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    /*
    *  id
    *  Usuario
    *  Descricao
    *  Titulo
    *  Dt inicio
    *  Dt fim
    *  Prioridade
    *
    * */
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;

    @Column(length = 50)
    private String tittle;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
    private UUID userId;


    @CreationTimestamp
    private LocalDateTime createdAt;


}
