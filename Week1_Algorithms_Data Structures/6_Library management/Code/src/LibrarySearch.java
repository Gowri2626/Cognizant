import java.util.Arrays;
import java.util.Comparator;

public class LibrarySearch {

    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String targetTitle) {
        Arrays.sort(books, Comparator.comparing(Book::getTitle));

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(targetTitle);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
