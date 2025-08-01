package com.practice.MangaCollection.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostNewChapter {

    @Min(2)
    @Max(30)
    private int pageCount;
    private List<String> pageUrl;
    private int mangaId;
}
