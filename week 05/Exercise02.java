class Link {
    public int bookID;
    public String bookTitle;
    public int copies;
    public Link next;

    public Link(int bookID, String bookTitle, int copies) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.copies = copies;
        this.next = null;
    }

    public void displayLink() {
        System.out.println("ID: " + bookID + ", Title: " + bookTitle + ", Copies: " + copies);
    }
}

class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, String title, int copies) {
        Link newLink = new Link(id, title, copies);
        newLink.next = first;
        first = newLink;
    }

    public boolean insertAfter(int key, int id, String title, int copies) {
        Link current = first;

        while (current != null && current.bookID != key) {
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        Link newLink = new Link(id, title, copies);
        newLink.next = current.next;
        current.next = newLink;
        return true;
    }

    public Link find(int key) {
        Link current = first;

        while (current != null) {
            if (current.bookID == key) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public Link deleteFirst() {
        if (isEmpty()) {
            return null;
        }

        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link delete(int key) {
        if (isEmpty()) {
            return null;
        }

        Link current = first;
        Link previous = null;

        while (current != null && current.bookID != key) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return null;
        }

        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }

        return current;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}

public class Exercise02{
    public static void main(String[] args) {
        LinkedList library = new LinkedList();

        // i. Insert Initial Books
        library.insertFirst(1, "Hello", 15);
        library.insertFirst(2, "World", 4);
        library.insertAfter(1, 3, "Welcome", 8);

        System.out.println("List after insertions:");
        library.displayList();


        Link foundBook = library.find(1);
        if (foundBook != null) {
            System.out.println("\nFound Book:");
            foundBook.displayLink();
        } else {
            System.out.println("\nBook not found.");
        }


        library.delete(2);
        System.out.println("\nList after deleting ID 2:");
        library.displayList();

       
        library.deleteFirst();
        System.out.println("\nList after deleting first element:");
        library.displayList();


        System.out.println("\nAvailable Books:");
        library.displayList();
    }
}
