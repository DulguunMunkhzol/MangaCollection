package com.practice.MangaCollection.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "manga", indexes = @Index(columnList =  "publisher, genre") )
public class Manga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    @Size(min = 3, max = 200, message = "The title needs to be at least 3 letters to 200 letters")
    private String title;

    @Column(nullable = false)
    @Size(min = 3, max = 150, message = "The title needs to be at least 3 letters to 150 letters")
    private String countryOrigin;

    @Column(nullable = false)
    @Size(min = 6, max = 30, message = "the genre needs to be 6 to 30 characters")
    private String genre;

    @Column(nullable = false)
    private LocalDate releaseDate;

    @Column(nullable = false)
    private String status = "live";

    @Column(nullable = false)
    @Size(min = 2, max = 300, message = "Author name needs to be between 2 to 300 characters long")
    private String publisher;

    @Column(nullable = false)
    @Min(1)
    @Max(10)
    private byte rating = 1;

    @CreationTimestamp
    private LocalDateTime dateCreated;

    @OneToMany(mappedBy = "manga", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonManagedReference
    private List<Chapter> chapters;

}
