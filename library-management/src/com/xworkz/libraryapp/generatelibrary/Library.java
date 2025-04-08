package com.xworkz.libraryapp.generatelibrary;

import com.xworkz.libraryapp.librarydto.LibraryDto;

public class Library {

    public boolean addBook(LibraryDto dto) {
        boolean isBookAdded = false;
        boolean validated = validateBook(dto);
        if (validated) {
            isBookAdded = true;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Book details invalid....");
        }
        return isBookAdded;
    }

    public boolean validateBook(LibraryDto dto) {
        boolean isValid = false;
        boolean titleValid = false;
        boolean authorValid = false;
        boolean publisherValid = false;
        boolean isbnValid = false;
        boolean dateValid = false;
        boolean genreValid = false;
        boolean pagesValid = false;

        if (dto.getBookTitle() != null && !dto.getBookTitle().isEmpty()) {
            titleValid = true;
        } else {
            System.out.println("Invalid Book Title!!!!");
        }

        if (dto.getAuthorName() != null && !dto.getAuthorName().isEmpty()) {
            authorValid = true;
        } else {
            System.out.println("Invalid Author Name!!!!");
        }

        if (dto.getPublisher() != null && !dto.getPublisher().isEmpty()) {
            publisherValid = true;
        } else {
            System.out.println("Invalid Publisher!!!!");
        }

        if (dto.getIsbn() != null && !dto.getIsbn().isEmpty()) {
            isbnValid = true;
        } else {
            System.out.println("Invalid ISBN!!!!");
        }

        if (dto.getPublishDate() != null && !dto.getPublishDate().isEmpty()) {
            dateValid = true;
        } else {
            System.out.println("Invalid Publish Date!!!!");
        }

        if (dto.getGenre() != null) {
            genreValid = true;
        } else {
            System.out.println("Invalid Genre!!!!");
        }

        if (dto.getNumberOfPages() > 0) {
            pagesValid = true;
        } else {
            System.out.println("Invalid Number of Pages!!!!");
        }

        if (titleValid && authorValid && publisherValid && isbnValid &&
                dateValid && genreValid && pagesValid) {
            isValid = true;
        }

        return isValid;
    }
}
