class Shelf {
    private String section;
    private int capacity;

    Shelf(String section) {
        this.section = section;
        this.capacity = 20;
    }
    Shelf(String section, int capacity) {
        this.section = section;
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 10;
        }
    }
    public void displayShelf() {
        System.out.println("Section: " + section + ", Capacity: " + capacity);
    }
}
