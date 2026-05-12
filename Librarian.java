class Librarian {
    private String name;
    private Novel[] managedNovels = new Novel[3];

    Librarian(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean addNovel(Novel n) {
        return false;
    }
    public void listNovels() {
        System.out.println("No novels assigned");
    }
}
