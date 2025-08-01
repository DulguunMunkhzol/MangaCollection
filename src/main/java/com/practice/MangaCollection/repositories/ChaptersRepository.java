package com.practice.MangaCollection.repositories;

import com.practice.MangaCollection.entities.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChaptersRepository extends JpaRepository<Chapter, Integer>{
}
