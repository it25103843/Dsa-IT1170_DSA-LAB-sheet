package ex01;

import java.util.Scanner;

public class TreeApp {
    public static void main(String[] args) {
        Tree employeeTree = new Tree();

        employeeTree.insert(149, "Anusha");
        employeeTree.insert(167, "Kosala");
        employeeTree.insert(47, "Dinusha");
        employeeTree.insert(66, "Mihiri");
        employeeTree.insert(159, "Jayani");
        employeeTree.insert(118, "Nimal");
        employeeTree.insert(195, "Nishantha");
        employeeTree.insert(34, "Avodya");
        employeeTree.insert(105, "Bimali");
        employeeTree.insert(133, "Sampath");

        System.out.println("Inorder Traversal:");
        employeeTree.inOrder();

        System.out.println("\nPreorder Traversal:");
        employeeTree.preOrder();

        System.out.println("\nPostorder Traversal:");
        employeeTree.postOrder();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Employee Number to search: ");
        int searchId = scanner.nextInt();

        Node found = employeeTree.findRecursive(searchId);
        if (found != null) {
            System.out.print("Employee Found: ");
            found.displayNode();
            System.out.println();
        } else {
            System.out.println("Employee does not exist.");
        }

        employeeTree.deleteAll();

        System.out.println("\nDisplaying tree after deletion (Inorder):");
        employeeTree.inOrder();

        scanner.close();
    }
}
