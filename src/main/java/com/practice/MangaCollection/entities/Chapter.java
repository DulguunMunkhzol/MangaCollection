package com.practice.MangaCollection.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chapter")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @Min(value = 1)
    @Max(value=30)
    private int pageCount;

    @ElementCollection
    @CollectionTable(name = "page_url",joinColumns = @JoinColumn(name = "chapter_id"))
    @Column(name="page_url")
    private List<String> pageUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "manga_id")
    @JsonBackReference
    @JsonIgnore
    @ToString.Exclude
    private Manga manga;

}
