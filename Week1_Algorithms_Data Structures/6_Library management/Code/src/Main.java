public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B001", "The Alchemist", "Paulo Coelho"),
            new Book("B002", "Clean Code", "Robert C. Martin"),
            new Book("B003", "Introduction to Algorithms", "CLRS"),
            new Book("B004", "Effective Java", "Joshua Bloch"),
            new Book("B005", "1984", "George Orwell")
        };

        System.out.println("Linear Search Result:");
        Book foundLinear = LibrarySearch.linearSearch(books, "Clean Code");
        System.out.println(foundLinear != null ? foundLinear : "Book not found");

        System.out.println("\nBinary Search Result:");
        Book foundBinary = LibrarySearch.binarySearch(books, "Clean Code");
        System.out.println(foundBinary != null ? foundBinary : "Book not found");
    }
}

