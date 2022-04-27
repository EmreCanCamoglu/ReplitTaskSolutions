package projects;

public class Book {
    private String title, author, tableOfContents = "";
    private int page = 100, nextPage = 1;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTableOfContents() {
        return tableOfContents;
    }

    public int getPage() {
        return nextPage;
    }

    public String toString() {
        return this.title + "\n" + this.author;
    }

    public void addChapter(String title, int pages) {
        System.out.println("\n" + title + "...");
        this.nextPage += pages;
        System.out.println(this.nextPage);
    }
}

class mainn {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book b = new Book("Pirates of the Caribbean", "Jack Sparrow");
        System.out.println(b.getTableOfContents());
        System.out.println(b.getPage());
        System.out.println(b);
        b.addChapter("Captain Jack", 6);
    }
}
