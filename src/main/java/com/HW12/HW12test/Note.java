package com.HW12.HW12test;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Note {
    private String id;
    private String title;
    private String content;
}
