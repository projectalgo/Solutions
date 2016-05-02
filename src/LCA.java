public class LCAUsingExtraStorage{
    
    
    public Integer lca(int a, int b)
    {
        Queue<Integer> queue1 = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();
        
        search(a, queue1);
        search(b,queue2);
        int lca;
        while(queue1.getFirst().compareTo(queue2.getFirst())==0)
        {
            lca=queue1.remove();
            queue2.remove();
        }
        return Integer.valueOf(lca);
        
    }
    
    private void search(int a, List<Integer> q)
    {
        if(root == null)
            return;
        Node n = root;
        while(n!=null)
        {
            q.add(n);
            if(a<n.val)
            {
                n = n.left;
            }
            else if(a>n.val)
                n = n.right;
            else
                break;
                
        }
    }

    
}