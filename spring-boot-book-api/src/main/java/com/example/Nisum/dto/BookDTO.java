package com.example.Nisum.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class BookDTO {
    private Long id;

    @NotBlank(message = "Title must not be blank")
    private String title;

    @NotBlank(message = "Author must not be blank")
    private String author;

    @Positive(message = "Year must be positive")
    private int publishedYear;

    // Getters and Setters
}
