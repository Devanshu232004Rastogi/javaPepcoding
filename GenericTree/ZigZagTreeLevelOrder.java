import java.util.Stack;

public class ZigZagTreeLevelOrder {

    // class Node{

    // int data ;
    // ArrayList<Node> Children = new ArrayList<>();

    // }

    static void ZigZagLvlT(Node node){
        Stack<Node> pst = new Stack<>();
Stack<Node> cst = new Stack<>();

pst.push(node);
int level = 1;

while (!pst.isEmpty()) {
    while (!pst.isEmpty()) {
        Node n = pst.pop();
        System.out.print(n.data + " ");

        if (level % 2 == 1) {
            for (int i = 0; i <= n.Children.size() - 1; i++) {
                cst.push(n.Children.get(i));
            }
        } else {
            for (int i = n.Children.size() - 1; i >= 0; i--) {
                cst.push(n.Children.get(i));
            }
        }
    }

    System.out.println();
    pst = cst;
    cst = new Stack<>();
    level++;
}

    }

    public static void main(String[] args) {
        // int[] arr = { 2, 3, 5, -1, 7, -1, 4, -1, -1, 6, 8, 11, -1, 12, -1, -1, 9, 10,
        // -1, -1, -1, -1 };
        int[] arr = { 10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1 };

        Stack<Node> st = new Stack<>();
        Node root = null;
        for (int i : arr) {
            if (i == -1)
                st.pop();
            else {
                Node t = new Node();
                t.data = i;

                if (st.size() > 0) {
                    st.peek().Children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        ZigZagLvlT(root);
    }

}
