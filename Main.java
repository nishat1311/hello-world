public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[4];

        books[0] = new Novel("Harry Potter", 200, "Fantasy");
        books[1] = new Novel("Gone Girl", 170, "Thriller");
        books[2] = new Novel("The Martian", 189, "Sci-Fi");
        books[3] = new Novel("Sherlock Holmes", 250, "Mystery");

        Librarian l1 = new Librarian("Mr.Jones");
        Librarian l2 = new Librarian("Mr Spencer");

        for (int i = 0; i < books.length; i++) {
            books[i].displayInfo();
        }

        l1.addNovel((Novel) books[0]);
        l1.addNovel((Novel) books[1]);

        l2.addNovel((Novel) books[2]);
        l2.addNovel((Novel) books[3]);

        Shelf s1 = new Shelf("A");
        Shelf s2 = new Shelf("C", 15);

        s1.displayShelf();
        s2.displayShelf();

        LoanRecord r1 = new LoanRecord((Novel) books[0], l1);
        LoanRecord r2 = new LoanRecord((Novel) books[2], l2);

        r1.setFine(50.0);
        r2.setFine(-10.0);

        System.out.println(r1.getRecord());
        System.out.println(r2.getRecord());

        l1.listNovels();
        l2.listNovels();
    }
}
