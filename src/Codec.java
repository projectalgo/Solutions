/** 
 * Definition for a binary tree node. **/
 import java.util.LinkedList;
 import java.util.Queue;
 import java.util.Scanner;
 
public class Codec { 
    
    public class TreeNode { 
    int val; 
    TreeNode left; 
    TreeNode right; 
    TreeNode(int x) { val = x; } 
    } 
 
    // Encodes a tree to a single string. 
    public String serialize(TreeNode root) { 
         
        
         
        StringBuilder s = new StringBuilder("["); 
         
        Queue<TreeNode> q = new LinkedList<TreeNode>(); 
         
        TreeNode t = root; 
        q.add(t); 
        while (q.size() > 0) 
        { 
          
            TreeNode node = q.remove(); 
            if(node == null) 
            { 
               // s.append("null,");
                continue;
                
                
            } 
            else{
            s.append(Integer.toString(node.val)); 
            
            s.append(","); 
            q.add(node.left); 
            q.add(node.right); 
            }
             
        } 
        s.deleteCharAt(s.length()-1); 
        s.append("]"); 
        return s.toString(); 
         
    } 
 
    private TreeNode insert(TreeNode node, int i) 
    { 
        if(node == null) 
          return new TreeNode(i); 
        else 
        { 
            if ( i == node.val) 
              return node; 
            else if( i < node.val) 
              { 
                  node.left = insert(node.left, i); 
                   
              } 
              else 
              { 
                  node.right = insert(node.right,i); 
              } 
              return node; 
        } 
        
    } 
    // Decodes your encoded data to tree. 
    public TreeNode deserialize(String data) { 
        String d = data.substring(1,data.length()-1); 
        System.out.println("d is " + d);
        Scanner s = new Scanner(d); 
        s.useDelimiter(","); 
        TreeNode root = null; 
        int level = 0; 
        int count = 0; 
        while(s.hasNext())  
        { 
            
           if(count < Math.pow(2,level)) 
           { 
               String str = s.next(); 
               if( str.compareTo("null") != 0) 
               { 
                 root = insert(root,Integer.valueOf(str)); 
               } 
               count++; 
           } 
           else 
           { 
               level++; 
               count = 0; 
           } 
             
        } 
        return root; 
         
    } 
    
    public static void main(String[] args)
    {
        Codec codec = new Codec(); 
        TreeNode root = null;
        root = codec.insert(root,1);
        codec.insert(root,2);
        root=codec.deserialize(codec.serialize(root));
        System.out.println(codec.serialize(root));
    }
}