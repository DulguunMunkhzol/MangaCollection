package com.practice.MangaCollection.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Setter(AccessLevel.NONE)
public class MangaDto {
    private final String title;
    private final String country;
    private final LocalDate datePublished;
    private final String status;
    private final String author;
}
