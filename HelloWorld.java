//Sample code for learning algorithm

public class HelloWorld{ 
     
     static int mySquare(int c) {
         return c * c;
     }
     
     public static void main(String []args) {
        System.out.println("Hello World");
        int[][] a = {{1,2,3}, {4,5,6,10}};
        int[] b = {2, 100, 3, 23, 2, 4};
        int sum = 0;
        int[] sumarray = new int[7];
        int[][] twoArray = new int[3][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
        }
        sum = 0; 
        for (int i = 0; i < b.length; i++) {
            if (i % 3 == 0) {
                sum = sum + b[i];
            }
        }
        
        myPrint(b);
        mySort(b);
        myPrint(b);
     }
     
     static void myPrint(int[] temp) {
         for (int i = 0; i < temp.length; i++) {
             System.out.print(temp[i] + " ");
         }
         System.out.println();
     }
     
     static void swap(int[] d, int i, int j) {
         int temp = d[i];
         d[i] = d[j];
         d[j] = temp;
     }
     
     static void mySort(int[] d) {
         for (int i = 0; i < d.length; i++) {
             for (int j = i + 1; j < d.length; j++) {
                 if (d[j] < d[i]) {
                     swap(d, i, j);
                 }
             }
         }
     }
}

static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
     }

public class HelloWorld{

     public static void main(String []args) {
        System.out.println("Hello World");
        int[] a = {2, 5, 3, 1, 16, 19, -3};
        int sum = 0; 
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("the sum is " + sum);
        
        myPrint(a);
        insertionSort(a);
        myPrint(a);
        ListNode head;
        initializeList(head); 
        printList(head);
     }
     
     static void myPrint(int[] a) {
         for (int i = 0; i < a.length; i++) {
             System.out.print(a[i] + " ");
         }
         System.out.println();
     }
     
     static void swap(int[] a, int i, int j) {
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp; 
     }
     
     static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
     }
     
     static void initializeList(ListNode head) {
         head = new ListNode(5);
         head.next = new ListNode(6);
         head.next.next = new ListNode(7);
         head.next.next.next = null;
     }
     
     static void printList(ListNode head) {
         for (ListNode temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.val);    
         }
     }
}

public class ListNode {
      int val;
      ListNode next;
      ListNode(int val) {
          this.val = val;
          this.next = null;
      }
}

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] a = {1, 76, 135};
        int sum = 0; 
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("the sum is " + sum);
        
        print(a);
        swap(a, 0, 2);
        print(a);
        ListNode head = new ListNode();
        buildList(head);
        printList(head);
     }
     
     public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
     }
     
     public static void swap(int[] a, int i, int j) {
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp; 
     }
     
     public static void buildList(ListNode head) {
        head.val =  5;
        head.next = new ListNode();
        head.next.val = 6;
        head.next.next = new ListNode();
        head.next.next.val = 7;
     }
     
     public static void printList(ListNode head) {
        for (ListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val);
            if (temp.next != null) {
               System.out.print("->"); 
            }
        }
     }
}

class ListNode {
    int val;
    ListNode next;
}

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        ListNode head = new ListNode();
        createList(head);
        printList(head);
        printList(reverseList(head));
     }
     
     public static void printArray(int[] a) {
         for (int i = 0; i < a.length; i++) {
             
         }
     }
     
     public static void printList(ListNode head) {
         for (ListNode temp = head; temp != null; temp = temp.next) {
             System.out.print(temp.val);
             if (temp.next != null) {
                 System.out.print("->");
             }
         }
         System.out.println();
     }
     
     public static void createList(ListNode head) {
         head.val = 5;
         head.next = new ListNode();
         head.next.val = 6;
         head.next.next = new ListNode();
         head.next.next.val = 7;
     }
     
     public static ListNode reverseList(ListNode head) {
         ListNode dummy = new ListNode();
         while (head != null) {
             ListNode temp = head.next;
             head.next = dummy.next;
             dummy.next = head;
             head = temp;
         }
         return dummy.next; 
     }
     
}

    

class ListNode {
    int val;
    ListNode next;
}

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] a = {1, 46, 68, 135};
        int sum = 0; 
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("the sum is " + sum);
        
        myPrint(a);
        reverseArray(a);
        myPrint(a);
     }
     
     static void myPrint(int[] b) {
         for (int i = 0; i < b.length; i++) {
             System.out.print(b[i] + " ");
         }
         System.out.println();
     }
     
     static void reverseArray(int[] c) {
         for (int i = 0, j = c.length - 1; i < j; i++, j--) {
             swap(c, i, j);
         }
     }
     
     static void swap(int[] a, int i, int j) {
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
     }
}

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] a = {36, 16, 856, 11, 12, 13};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("the sum is " + sum);
        
        myPrint(a);
        swap(a, 0, 1);
        myPrint(a);
        myOddPrint(a);
        reverse(a);
        myPrint(a);
     } 
     
     static void swap(int[] a, int i, int j) {
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
     }
     
     static void myPrint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
         }
         System.out.println();
     }
     
     static void myOddPrint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                System.out.print(a[i] + " ");
            }
         }
         System.out.println();
     }
     
     static void reverse(int[] a) {
         for (int i = 0, j = a.length - 1; i < j; i++, j--) {
             swap(a, i, j);
         }
     }
}

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[][] a = {{3, 7, 7, 1}, {6, 7, 8}, {2,3}}; 
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("the sum is " + sum);
        
        /*
        print(a);
        swap(a, 0, 1);
        print(a);
        sort(a);
        print(a);
        reverse(a);
        print(a);
        */
     }
     
     public static void swap(int[] a, int i, int j) {
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp; 
     }
     
     public static void print(int[] a) {
         for (int i = 0; i < a.length; i++) {
             System.out.print(a[i] + " ");
         }
         System.out.println();
     }
     
     public static void sort(int[] a) {
         for (int i = 0; i < a.length; i++) {
             for (int j = i + 1; j < a.length; j++) {
                 if (a[i] > a[j]) {
                     swap(a, i, j);
                 }
             }
         }
     }
     
     public static void reverse(int[] a) {
         for (int i = 0, j = a.length - 1; i < j; i++, j--) {
             swap (a, i, j);
         }
     }
}

public class HelloWorld{
    
    public static void main(String []args) {
        
        ListNode head = new ListNode(0);
        initializeList(head); 
        printList(head);
     }
     
     static void initializeList(ListNode head) {
         head.val = 5;
         head.next = new ListNode(6);
         head.next.next = new ListNode(7);
         head.next.next.next = null;
     }
     
     static void printList(ListNode head) {
         for (ListNode temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.val);    
         }
     }
    }

 class ListNode {
      int val;
      ListNode next;
      ListNode(int val) {
          this.val = val;
          this.next = null;
      }
     
}


import java.util.*;

public class HelloWorld{
   
    public static void main(String []args){
        System.out.println("Hello World");
        
        ListNode head = new ListNode(0);
        initList(head);
        printList(head);
        sumList(head);
        TreeNode root = new TreeNode(0);
        initTree(root);
        printTree(root);
    }
    
    static void initList(ListNode head) {
        head.val = 5;
        head.next = new ListNode(6);
        head.next.next = new ListNode(7);
        head.next.next.next = null;
     }
     
    static void printList(ListNode head) {
        for (ListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }
    
    static void sumList(ListNode head) {
        int sum = 0; 
        for (ListNode temp = head; temp != null; temp = temp.next) {
            sum += temp.val;
        }
        System.out.println("the sumList is " + sum);
    }

    /*
    static void initTree(TreeNode root) {
        root.val = 1;
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
    }
*/

static void initTree(TreeNode root) {
        root.val = 0;
        TreeNode left = new TreeNode(1);
        left.left = new TreeNode(3);
        left.right = new TreeNode(4);
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(5);
        right.right = new TreeNode(6);
        root.left = left;
        root.right = right;
    }
    
    static void printTree(TreeNode root) {
        if (root == null) {
            System.out.print("tree is empty");
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.size() != 0) {
            TreeNode node = q.poll();
            System.out.println(node.val);
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}


import java.util.*;

public class HelloWorld{
   
    public static void main(String []args){
        System.out.println("Hello World");
        
        ListNode head = new ListNode(0);
        initList(head);
        printList(head);
        sumList(head);
        TreeNode root = new TreeNode(0);
        initTree(root);
        
        printTreeQueue(root);
        sumTree(root);
        printTreeStack(root);
        System.out.println("square is " + 2 * mySquare(15));
    }
    
    static int mySquare(int a) {
        int square = a * a;
        
        return square;
    }
    
    static void initList(ListNode head) {
        head.val = 5;
        head.next = new ListNode(6);
        head.next.next = new ListNode(7);
        head.next.next.next = null;
     }
     
    static void printList(ListNode head) {
        for (ListNode temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }
    
    static void sumList(ListNode head) {
        int sum = 0; 
        for (ListNode temp = head; temp != null; temp = temp.next) {
            sum += temp.val;
        }
        System.out.println("the listsum is " + sum);
    }

    /*
    static void initTree(TreeNode root) {
        root.val = 1;
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
    }
*/

static void initTree(TreeNode root) {
        root.val = 0;
        TreeNode left = new TreeNode(1);
        left.left = new TreeNode(3);
        left.right = new TreeNode(4);
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(5);
        right.right = new TreeNode(6);
        root.left = left;
        root.right = right;
    }
    
    static void printTreeQueue(TreeNode root) {
        if (root == null) {
            System.out.print("tree is empty");
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.size() != 0) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
        }
        System.out.println();
        return;
    }
    
    static void sumTree(TreeNode root) {
        if (root == null) {
            System.out.print("tree is empty");
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0; 
        while (q.size() != 0) {
            TreeNode node = q.poll();
            //System.out.print(node.val + " ");
            sum += node.val;
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right!= null) {
                q.offer(node.right); 
            }
        }
        System.out.println("the sum is " + sum);
    }

    static void printTreeStack(TreeNode root) {
        if (root == null) {
            System.out.print("tree is empty");
            return;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (s.size() != 0) {
            TreeNode node = s.pop();
            System.out.print(node.val + " ");
            if (node.right != null) {
                s.push(node.right);
            }
            if (node.left != null) {
                s.push(node.left);
            }
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class HelloWorld{

    public static void main(String []args){
        System.out.println("Hello World");
        int[] a = {2, 12, 18, 22, 22, 22, 22, 22, 22, 30};
        if (args.length == 0) {
            System.out.println("please enter a number!");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            int index = binarySearch(a, Integer.parseInt(args[i]));
            System.out.print("Search for number " + args[i] + " .... ");
            if (index == -1) {
                System.out.println("cannot find the number");
            } else {
                System.out.println("find the number at postion " + (index + 1));
            }
        }
    }

    public static int binarySearch(int[] a, int target) {
        if (a == null || a.length == 0) {
            return -1;
        }
        int start = 0, end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target == a[mid]) {
                return mid;
            }
            if (target < a[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch2(int[] a, int target) {
        if (a == null || a.length == 0) {
            return -1;
        }
        int start = 0, end = a.length - 1;
        while (start < end - 1) {
            int mid = start + (end - start) / 2;
            if (target < a[mid]) {
                end = mid;
            }
            else {
                start = mid;
            }
        }

        if (a[start] == target) {
            return start;
        }
        if (a[end] == target) {
            return end;
        }

        return -1;
    }
}
package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.nio.file.*;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Open file
        //read number
        //calculate the sum
        //print out the sum
        List<Integer> list = new ArrayList<>();

        try {
            File file = new File("mydata.txt");
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\\D+");
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            sum += list.get(i);
        }

        System.out.println("the average is " + sum/list.size());
        System.out.println("End!");

        //write number 1 to 100 to a file
        try (PrintWriter myout = new PrintWriter("dataout.txt")) {
            for (int i = 0; i < 10; i++) {
                myout.println(i + 1);
                System.out.println(i + 1);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

select * from students where id = '';
insert into students values ('', '');
delete from students where id = '';
update students set name = '' where id = ''

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        int[] a = {2, 6, 73, 4, 8, 5};
        
        int sum = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("the sum is " + sum);
        
        print(a);
        mergeSort(a, 0, a.length - 1);
        print(a);
        swap(a, 0, 1);
        print(a);
        reverse(a);
        print(a);
        selectionSort(a);
        print(a);
        int[] b = {2, 6, 7, 19};
        
     }
     
     public static void swap(int[] a, int i, int j) {
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
         
     }
     
     public static void print(int[] a) {
         for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");    
         }
         System.out.println();
         
     }
     
     public static void reverse(int[] a) {
         for (int i = 0, j = a.length - 1; i < j; i++, j--) {
             swap(a, i, j);
         }
         
     }
     
     public static void selectionSort(int[] a) {
         for (int i = 0; i < a.length - 1; i++) {
             for (int j = i + 1; j < a.length; j++) {
                 if (a[i] > a[j]) {
                     swap(a, i, j);
                 }
             }
         }
     }
     
     public static void merge(int[] a, int start, int end, int mid) {
         int[] temp = new int[end - start + 1];
         int i = start, j = mid + 1, k = 0; 
         while (i <= mid && j <= end) {
             if (a[i] <= a[j]) {
                 temp[k++] = a[i++]; 
             }
             else {
                 temp[k++] = a[j++];
             }
         }
    
         while (i <= mid) {
             temp[k++] = a[i++];
         }
         
         while (j <= end) {
             temp[k++] = a[j++];
         }
         
         for (int ii = 0; ii < k; ii++) {
             a[start + ii] = temp[ii]; 
         }
     }
     
     public static void mergeSort(int[] a, int start, int end) {
         if (start == end) 
            return;
         int mid = start + (end - start) / 2;
         mergeSort(a, start, mid);
         mergeSort(a, mid + 1, end)
         merge(a, start, end, mid);
     }
}

