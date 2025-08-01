package com.practice.MangaCollection.services.manga;

import com.practice.MangaCollection.dto.MangaDto;
import com.practice.MangaCollection.dto.PostNewManga;

import java.time.LocalDate;
import java.util.List;

public class AdminMangaServiceImpl implements MangaService {
    @Override
    public List getAllManga() {
        return List.of();
    }

    @Override
    public List getAllMangaByGenre(String genre) {
        return List.of();
    }

    @Override
    public List getAllMangaByAuthor(String author) {
        return List.of();
    }

    @Override
    public List getAllMangaByCountryOfOrigin(String country) {
        return List.of();
    }

    @Override
    public List getAllMangaByDate(LocalDate date) {
        return List.of();
    }

    @Override
    public MangaDto getMangaByTitle(String title) {
        return null;
    }

    @Override
    public MangaDto getMangaById(int id) {
        return null;
    }

    @Override
    public MangaDto createManga(PostNewManga manga) {
        return null;
    }

    @Override
    public MangaDto updateRating(int bookId, byte rating) {
        return null;
    }

    @Override
    public MangaDto updateManga(MangaDto mangaDto) {
        return null;
    }

    @Override
    public void deleteMangaById(int mangaId) {

    }
}
