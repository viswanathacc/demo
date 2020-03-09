package com.example.demo.controller;

import com.example.demo.controller.BookController;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class BookControllerTest {
    private MockMvc mockMvc;
    @Mock
    private BookRepository bookRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        Mockito.mock(BookRepository.class).findAll();
        final BookController bookController = new BookController();
        bookController.setBookRepository(bookRepository);
        mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();

    }

    @Test
    public void findAll_ReturnsAllBooks() throws Exception {
        Book book = new Book();
        book.setAuthor("authur");
        book.setId(1);
        book.setTitle("title");
        when(bookRepository.findAll()).thenReturn(Arrays.asList(book));
        mockMvc.perform(MockMvcRequestBuilders.get("/api/books")).andExpect(status().isOk());

    }
}
