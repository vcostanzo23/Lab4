<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      Lab4.outputList(insertionSortedList);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    for (int i = 1; i < integerList.size(); i++) {
        int key = integerList.get(i);
        int j = i - 1;

        // Move elements of integerList[0..i-1], that are greater than key,
        // to one position ahead of their current position
        while (j >= 0 && integerList.get(j) > key) {
            integerList.set(j + 1, integerList.get(j));
            j = j - 1;
        }
        integerList.set(j + 1, key);
    }


    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    //Step 2 - Implement the bubble sort algorithm here
    int n = integerList.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (integerList.get(j) > integerList.get(j + 1)) {
                // Swap elements
                int temp = integerList.get(j);
                integerList.set(j, integerList.get(j + 1));
                integerList.set(j + 1, temp);
            }
        }
    }

    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
=======
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: Vince Costanzo
// Notes: The instructions are found in comments through the code starting with "Step n"
//        Please leave the comments and add your code just after the comment.
//        Use the examples in the book to complete the lab.

class Main {
  public static void main(String[] args) {
    Lab2 lab = new Lab2();
    // Comment/Uncomment the following 3 method calls as you work on each method.
    // No code should be added to the main method. All of your code will go into the methods in Lab2.
    lab.linkedList();
    lab.queue();
    lab.stack();
  }
}

class Lab2 {
  public void linkedList() {
    // 1. Create a LinkedList<String> object called progLanguages
    LinkedList<String> progLanguages = new LinkedList<String>();


    // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
    progLanguages.add("Java");
    progLanguages.add("Python");
    progLanguages.add("JavaScript");
    progLanguages.add("C++");

    // 3. Remove the element "C++" from the list using .remove()
    progLanguages.remove("C++");

    // 4. Add an element "HTML" at index 2.
    progLanguages.add(2, "HTML");

    // 5. Iterate over progLanguages and use println() to output each element. You must create an Iterator<string> and use hasNext(), and next() similar to the example in our book.
    Iterator<String> iter = progLanguages.iterator();
    while(iter.hasNext()) {
      System.out.println(iter.next());
    }
    
  }
  
  public void queue() {
    // 6. Create a Queue<String> called q
    Queue<String> q = new LinkedList<String>();


    // 7. Add 5 first names to q.
    q.add("Alice");
    q.add("Bob");
    q.add("Charlie");
    q.add("David");
    q.add("Eve");

    // 8. Uncomment the following line
    System.out.println("Elements of queue: " + q);
    

    // 9. Remove the head of the queue and assign it to a String variable removedElement.
    //    Display the value of "Removed element: " + removedElement
    String removedElement = q.poll();
    System.out.println("Removed element: " + removedElement);

    // 10. View the head of the queue using peek(). Output it's value.
    System.out.println("Head of queue: " + q.peek());

    // 11. Using for(String element : q), output all of the values in the queue.
    for(String element : q) {
      System.out.println(element);
    }

    
  }

  public void stack() {
    // 12. Create a Stack<String> called bookStack
    Stack<String> bookStack = new Stack<String>();


    // 13. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"
    bookStack.push("Clean Code");
    bookStack.push("Design Patterns");
    bookStack.push("Pragmatic Programmer");

    // 14. pop() 1 book off the stack. Display it's value
    String poppedBook = bookStack.pop();
    System.out.println("Popped book: " + poppedBook);


    // 15. Use the peek() method to view the top book on the stack
    System.out.println("Top book: " + bookStack.peek());


    // 16. push() "Web DB Technologies" onto the stack
    bookStack.push("Web DB Technologies");


    // 17. Use the peek() method to view the top book on the stack
    System.out.println("Top book: " + bookStack.peek());

    // 18. Search for "Design Patterns" in the stack. Display the results of the search.
    int searchIndex = bookStack.search("Design Patterns");

    // 19. Call empty(). Output the results
    System.out.println("Is the stack empty? " + bookStack.empty());

    // 20. Print the titles of all of the books on the stack
    System.out.println("All books in stack:");
    for(String book : bookStack) {
      System.out.println(book);
    }
    
  }

  
>>>>>>> ba16fc46ba23e5a8174fe16cf1f66fa4122e1927
}