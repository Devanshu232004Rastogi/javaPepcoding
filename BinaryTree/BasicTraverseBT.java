
import java.util.Stack;

public class BasicTraverseBT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {

            this.data = data;

        }

    }

    static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }


    static void traverseTheBT(Node  node){
if(node.left!=null){
    System.out.print(node.left.data+("--->"));
}else{
    System.out.print(".--->");
}

System.out.print(node.data+("--->"));

if(node.right!=null){
    System.out.print(node.right.data);
}else{
    System.out.print(".");
}


traverseTheBT(node.left);
traverseTheBT(node.right);
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null , null , 75, 62, null ,70, 80, null, null };

        Node rNode = new Node(arr[0]);

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(rNode, 1));

        int idx = 1;
        while (!st.isEmpty() && idx < arr.length) {
            Pair top = st.peek();

            if (top.state == 1) {

                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx]);
                    st.push(new Pair(top.node.left, 1));
                }
                idx++;
                top.state++;
            } else if (top.state == 2) {
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx]);
                    st.push(new Pair(top.node.right, 1));
                }
                idx++;
                top.state++;
            } else {
                st.pop();
            }
        }
        traverseTheBT(rNode);
    }

}
