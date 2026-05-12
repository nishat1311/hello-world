class Book {
    private String title;
    private int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = 50;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        if (pages >= 50) {
            this.pages = pages;
        } else {
            System.out.println("Invalid");
        }
    }
    public void displayInfo() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }
}

class Novel extends Book {
    private String genre;

    Novel(String title, int pages, String genre) {
        super(title, pages);
        this.genre = genre;
    }
        public String getGenre() {
            return genre;
        }
        public void setGenre(String genre) {
            this.genre = genre;
        }
        @Override
            public void displayInfo() {
            System.out.println("Title: " + getTitle() + ", Pages: " + getPages() + ", Genre: " + genre);
        }
    }
