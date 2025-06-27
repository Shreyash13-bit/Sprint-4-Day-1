package com.example.Nisum.service;

import com.example.Nisum.dto.BookDTO;
import java.util.List;

public interface BookService {
    BookDTO create(BookDTO dto);
    BookDTO get(Long id);
    BookDTO update(Long id, BookDTO dto);
    void delete(Long id);
    List<BookDTO> list();
}
