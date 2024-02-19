package com.ups.poo.bootstrapdata;

import com.ups.poo.domain.Author;
import com.ups.poo.domain.Book;
import com.ups.poo.repository.AuthorRepository;
import com.ups.poo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    public BootStrapData(AuthorRepository authorRepository,
                         BookRepository bookRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        Book book1 = new Book();
        book1.setTitle("La Odisea");
        book1.setEditorial("La Esfera de los Libros");

        Book book2 = new Book();
        book2.setTitle("Frankenstein");
        book2.setEditorial("Editorial Valdemar");

        Book book3 = new Book();
        book3.setTitle("Cien años de soledad");
        book3.setEditorial("Editorial Sudamericana");

        Book book4 = new Book();
        book4.setTitle("Cronicas de una muerte anunciada");
        book4.setEditorial("La oveja negra");

        Author author1 = new Author("Homero", "Altes");
        author1.getBooks().add(book1);

        Author author2 = new Author("Marey", "Shelley");
        author2.getBooks().add(book2);

        Author author3 = new Author("Gabriel", "Marquez");
        author3.getBooks().add(book3);
        author3.getBooks().add(book4);

        //save objects in entitles

        bookRepository.save(book1);
        authorRepository.save(author1);

        bookRepository.save(book2);
        authorRepository.save(author2);

        bookRepository.save(book3);
        bookRepository.save(book4);
        authorRepository.save(author3);

        System.out.println("-------- Started BootStrapData --------");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Authors: " + authorRepository.count());
    }
}
