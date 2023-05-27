package com.agakas.testtask.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

//Расширенная модель задачи
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task extends GeneralTask{

    private String description;
    private LocalDateTime time;
    private Long performer;

}
