package com.practice.MangaCollection.repositories;

import com.practice.MangaCollection.entities.Manga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MangaRepository  extends JpaRepository<Manga, Integer> {
}
