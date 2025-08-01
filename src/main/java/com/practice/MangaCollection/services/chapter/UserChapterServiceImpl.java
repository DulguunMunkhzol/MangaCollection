package com.practice.MangaCollection.services.chapter;

import com.practice.MangaCollection.dto.ChapterDto;
import com.practice.MangaCollection.dto.PostNewChapter;
import com.practice.MangaCollection.entities.Chapter;

import java.util.List;

public class UserChapterServiceImpl implements ChapterService{
    @Override
    public List findAllChaptersByMangaID(int mangaId) {
        return List.of();
    }

    @Override
    public Chapter getChapterById(int mangaId, int id) {
        return null;
    }

    @Override
    public Chapter createChapter(PostNewChapter mangaChapter) {
        return null;
    }

    @Override
    public Chapter updateChapter(ChapterDto chapterDto) {
        return null;
    }

    @Override
    public void deleteChapterById(int chapterId) {

    }
}
