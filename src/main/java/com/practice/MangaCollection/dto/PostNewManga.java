package com.practice.MangaCollection.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostNewManga {
    @Size(min = 3, max = 150, message = "Minimum 3 to Maximum 150 characters allowed")
    private  String title;
    @Size(min = 3, max = 150, message = "Minimum 3 to Maximum 150 characters allowed")
    private  String country;
    private LocalDate datePublished;
    @Size(min = 3, max = 150, message = "Minimum 3 to Maximum 150 characters allowed")
    private  String status;
    @Size(min = 3, max = 150, message = "Minimum 3 to Maximum 150 characters allowed")
    private  String author;
}
