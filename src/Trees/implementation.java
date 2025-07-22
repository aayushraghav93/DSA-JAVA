package Trees;

public class implementation {
    public static class Node{
        int val;
        Node left;
        Node right;
    }
    public static void display(sizeMaxSumHeight.Node root){
        if(root==null) return;
        System.out.print(root.val+" -> ");
        if(root.left!=null) System.out.print(root.left.val+" ");
        if(root.right!=null)System.out.print (root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);


    }
    public static void main(String[] args) {
Node node=new Node();
        System.out.println(node.left);

    }
}
