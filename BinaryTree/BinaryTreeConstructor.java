
import java.util.Stack;

public class BinaryTreeConstructor {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
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

    public static void displayPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        displayPreorder(node.left);
        displayPreorder(node.right);
    }

    public static void main(String[] args) {
        Integer[] arr = { 10, 20, null, null, 30, 40, null, null, 50, null, null };

        Node root = new Node(arr[0], null, null);
        Pair rp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rp);

        int idx = 1;
        while (!st.isEmpty()) {
            Pair top = st.peek();

            if (top.state == 1) {
                if (arr[idx] != null) {
                    Node ln = new Node(arr[idx], null, null);
                    top.node.left = ln;
                    st.push(new Pair(ln, 1));

                }
                idx++;
                top.state++;
            } else if (top.state == 2) {
                if (arr[idx] != null) {
                    Node rn = new Node(arr[idx], null, null);
                    top.node.right = rn;
                    st.push(new Pair(rn, 1));

                }
                idx++;
                top.state++;

            } else {
                st.pop();
            }
        }

        System.out.println("Preorder traversal:");
        displayPreorder(root);
    }
}
