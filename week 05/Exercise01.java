class Link {
    public int id;
    public int marks;
    public Link next;

    public Link(int id, int marks) {
        this.id = id;
        this.marks = marks;
        this.next = null;
    }

    public void displayLink() {
        System.out.println("ID: " + id + ", Marks: " + marks);
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

    public void insertFirst(int id, int marks) {
        Link newLink = new Link(id, marks);
        newLink.next = first;
        first = newLink;
    }

    public boolean insertAfter(int key, int id, int marks) {
        Link current = first;

        while (current != null && current.id != key) {
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        Link newLink = new Link(id, marks);
        newLink.next = current.next;
        current.next = newLink;
        return true;
    }

    public Link find(int key) {
        Link current = first;

        while (current != null) {
            if (current.id == key) {
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

        while (current != null && current.id != key) {
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
        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}

public class Exercise01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insertFirst(101, 85);
        list.insertFirst(102, 90);
        list.insertAfter(101, 103, 75);

        System.out.println("List after insertions:");
        list.displayList();

        Link found = list.find(101);
        if (found != null) {
            System.out.println("\nFound record:");
            found.displayLink();
        } else {
            System.out.println("\nRecord not found.");
        }


        list.delete(102);
        System.out.println("\nList after deleting ID 102:");
        list.displayList();


        list.deleteFirst();
        System.out.println("\nList after deleting first element:");
        list.displayList();
    }
}
