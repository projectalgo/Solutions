public class EfficientLCA{
 
    public Node lca(int a, int b, Node n)
    {
        if( n == null)
            return null;
        if(n.val == a || n.val ==b)
            return n;
        else if(a < n.val && b <n.val)
            return lca(a,b,n.left);
        else if(a > n.val && b >n.val)
            return lca(a,b,n.right);
        else return n;//one of the value is on the right and one of the values is on the left.
        
        
        
    }
}