class SinglyLinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d){ //creating a constructor node
            data = d;
            next = null;
        }
    }
    
    void smallestElement(Node head) // for finding the 5 smallest element
    {
         
        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        int thirdmin = Integer.MAX_VALUE;
        int fourthmin = Integer.MAX_VALUE;
        int fifthmin = Integer.MAX_VALUE;
     
        while (head != null) //checking if head is not null
        {
     
            if (head.data < firstmin) //comparing the data to the firstmin
            {   
            	fifthmin = fourthmin;
		  		fourthmin = thirdmin;
		  		thirdmin = secondmin;
		  		secondmin = firstmin;
                firstmin = head.data;
            }
    
            else if (head.data < secondmin) //comparing the data to the secondmin
            {
            	fifthmin = fourthmin;
			  	fourthmin = thirdmin;
                thirdmin = secondmin;
                secondmin = head.data;
             
            }
            
            else if (head.data < thirdmin) //comparing the data to the thirdmin
            {
            	fifthmin = fourthmin;
		  		fourthmin = thirdmin;
            	thirdmin = head.data;
      
            } 
            
            else if (head.data < fourthmin) //comparing the data to the fourthtmin
            {
            	fifthmin = fourthmin;
		  		fourthmin = head.data;
          
            } 
            
            else {  
            	fifthmin = head.data; 
            }
            head = head.next;
        }
        System.out.println("Output:");
        System.out.println(firstmin);
        System.out.println(secondmin);
        System.out.println(thirdmin);
        System.out.println(fourthmin);
        System.out.println(fifthmin);
      
    }

    void printList(Node node){ //displaying the node
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        //putting node and new node after previous node
        head = new Node(90);
        head.next = new Node(50);
        head.next.next = new Node(10);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(19);
        head.next.next.next.next.next.next.next.next.next = new Node(10);
 
        System.out.print("Input: ");
        list.printList(head);
        System.out.println("");
        list.smallestElement(head);
    }
}