class LoanRecord {
    private Novel novel;
    private Librarian librarian;
    private double fine;

    LoanRecord(Novel novel, Librarian librarian) {
        this.novel = novel;
        this.librarian = librarian;
        this.fine = -1; //not set yet
    }

    public boolean setFine(double amount) {
        if (amount >= 0.0) {
            this.fine = amount;
            return true;
        } else {
            return false;
        }
    }

    public String getRecord() {
        if (fine < 0) {
            return "Unresolved";
        } else {
            return novel.getTitle() + " managed by " + librarian.getName() + ": " + fine;
        }
    }
}
