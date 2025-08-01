package com.practice.MangaCollection.services.chapter;

import com.practice.MangaCollection.dto.ChapterDto;
import com.practice.MangaCollection.dto.PostNewChapter;
import com.practice.MangaCollection.entities.Chapter;

import java.util.List;

public interface ChapterService<T extends Chapter, P extends PostNewChapter> {
    List<T> findAllChaptersByMangaID(int mangaId);
    T getChapterById(int mangaId, int id);
    T createChapter(P mangaChapter);
    T updateChapter(ChapterDto chapterDto);
    void deleteChapterById(int chapterId);
}
