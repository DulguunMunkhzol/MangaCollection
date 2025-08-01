package com.practice.MangaCollection.services.manga;

import com.practice.MangaCollection.dto.MangaDto;
import com.practice.MangaCollection.dto.PostNewManga;

import java.time.LocalDate;
import java.util.List;

public interface MangaService<T extends MangaDto, P extends PostNewManga> {
    List<T> getAllManga();
    List<T> getAllMangaByGenre(String genre);
    List<T> getAllMangaByAuthor(String author);
    List<T> getAllMangaByCountryOfOrigin(String country);
    List<T> getAllMangaByDate(LocalDate date);
    T getMangaByTitle(String title);
    T getMangaById(int id);
    T createManga(P manga);
    T updateRating(int bookId, byte rating);
    T updateManga(MangaDto mangaDto);
    void deleteMangaById(int mangaId);
}
