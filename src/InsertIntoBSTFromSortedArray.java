public class InsertIntoBSTFromSortedArray {
    
    public class Node{
     int data;
     Node left;
     Node right;
    }
    
    public Node root;
 
    public void insertFromSortedArray(int[] a, int start, int end)
    {
        //Assume a is sorted
        if (start<end)
            return;
        
        int mid = start + (end-start)/2;
        
        this.insert(a[mid]);
        
        insertFromSortedArray(a, start, mid-1);
        
        insertFromSortedArray(a, mid+1, end);
        
    }
    
    public void insert(int n)
    {
        insert(root,n);
    }
    
    private Node insert(Node node, int n)
    {
      if (node == null)
      {
          node = new Node(n);
      }
      else
      {
        if (n < node.data)
        {
            node.left = insert(node.left, n);
        }
        else if(n > node.data)
        {
            node.right = insert(node.right, n);
        }
        else
            return node;
      }
      return node;
    }
    
    
}