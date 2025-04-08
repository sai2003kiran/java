package com.xworkz.libraryapp.librarydto;

import com.xworkz.libraryapp.constants.BookGenre;

public class LibraryDto {

    private String bookTitle;
    private String authorName;
    private String publisher;
    private String isbn;
    private String publishDate;
    private BookGenre genre;
    private int numberOfPages;

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
