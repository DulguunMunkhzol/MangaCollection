package com.practice.MangaCollection.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
@Setter(AccessLevel.NONE)
public class ChapterDto {
    private final int pageCount;
    private final List<String> pageUrl;
    private final int mangaId;
}
