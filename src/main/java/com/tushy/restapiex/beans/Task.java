package com.tushy.restapiex.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Task {
    private Long id;
    private String description;
    private Long priority;

}
