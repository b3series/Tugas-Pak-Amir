class GFG2
{ 
  
// Linked list nnode  
static class node  
{  
    int data;  
    node next;  
};  
  
// Function to create a new node  
// with given data  
static node newNode(int data)  
{  
    node new_node = new node();  
    new_node.data = data;  
    new_node.next = null;  
    return new_node;  
}  
  
// Function to insert a node at the  
// beginning of the Linked List  
static node push( node head_ref, int new_data)  
{  
    // allocate node  
    node new_node = newNode(new_data);  
  
    // link the old list off the new node  
    new_node.next = (head_ref);  
  
    // move the head to point to the new node  
    (head_ref) = new_node;  
    return head_ref; 
}  
  
// Multiply contents of two linked lists  
static long multiplyTwoLists ( node first, node second)  
{  
    int num1 = 0, num2 = 0;  
      
    // Generate numbers from linked lists  
    while (first != null || second != null)  
    {  
        if (first != null)  
        {  
            num1 = num1*10 + first.data;  
            first = first.next;  
        }  
        if (second != null)  
        {  
            num2 = num2*10 + second.data;  
            second = second.next;  
        }  
    }  
  
    // Return multiplication of  
    // two numbers  
    return num1*num2;  
}  
  
// A utility function to print a linked list  
static void printList( node node)  
{  
    while(node != null)  
    {  
        System.out.printf("%d", node.data);  
        if(node.next != null)  
            System.out.printf("->");  
        node = node.next;  
    }  
    System.out.printf("\n");  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    node first = null;  
    node second = null;  
  
    // create first list 9.4.6  
    first = push(first, 6);  
    first = push(first, 4);  
    first = push(first, 9);  
    System.out.printf("First List is: ");  
    printList(first);  
  
    // create second list 8.4  
    second = push(second, 4);  
    second = push(second, 8);  
    System.out.printf("Second List is: ");  
    printList(second);  
  
    // Multiply the two lists and see result  
    System.out.printf("Result is: ");  
    System.out.println(multiplyTwoLists(first, second));  
} 
}  
