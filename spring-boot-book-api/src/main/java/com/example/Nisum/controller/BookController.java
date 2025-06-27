package com.example.Nisum.controller;

import com.example.Nisum.dto.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @PostMapping public ResponseEntity<BookDTO> create(@RequestBody BookDTO dto) { return ResponseEntity.ok(dto); }
    @GetMapping("/{id}") public ResponseEntity<BookDTO> get(@PathVariable Long id) { return ResponseEntity.ok(new BookDTO()); }
    @PutMapping("/{id}") public ResponseEntity<BookDTO> update(@PathVariable Long id, @RequestBody BookDTO dto) { return ResponseEntity.ok(dto); }
    @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id) { return ResponseEntity.noContent().build(); }
    @GetMapping public ResponseEntity<List<BookDTO>> list() { return ResponseEntity.ok(List.of()); }
}
