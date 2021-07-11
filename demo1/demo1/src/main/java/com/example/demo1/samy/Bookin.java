package com.example.demo1.samy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bookin {
    private Long id;
    private String title;
    private String author;
    private String coverPhotoURL;
    private Long isbnNumber;
    private Double price;
    private String language;


}
