package ie.atu.sw;

// Package private class - part of the internal implementation
 class Book {
     private String title;
     private int publicationYear;

     public Book(String title, int publicationYear) {
         this.title = title;
         this.publicationYear = publicationYear;
     }

     public String getTitle() {
         return title;
     }

     public int getPublicationYear() {
         return publicationYear;
     }
 }
