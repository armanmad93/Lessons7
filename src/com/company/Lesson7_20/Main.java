package com.company.Lesson7_20;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //20. Create  classes Book and Author
        //Author
        // -name(String)
        //-surname (String)
        //-gender ( String (or enum) -> MALE, FEMALE, OTHER )
        //Book
        //-title (String)
        //-authors (array of type Author)
        //-price (double)
        //Create a Book in main with multiple Authors

        Random random = new Random();

        Author author1 = new Author("Roland", "Emmerich", "MALE");
        Author author2 = new Author("Stephen", "King", "MALE");
        Author author3 = new Author("Jhon", "Snow", "MALE");

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        Book book = new Book("13th floor", authors, random.nextDouble());

        System.out.println("1.");
        System.out.println("Title: " + book.getTitle());
        System.out.print("Authers: " + book.getAuthors().get(0).getName() + " " + book.getAuthors().get(0).getSurename() + " , ");
        System.out.print(book.getAuthors().get(1).getName() + " " + book.getAuthors().get(1).getSurename() + " , ");
        System.out.print(book.getAuthors().get(2).getName() + " " + book.getAuthors().get(2).getSurename());
        System.out.println();
        System.out.println("Price: " + book.getPrice() + "$");

    }

}
