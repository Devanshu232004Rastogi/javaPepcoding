import java.util.Stack;

class HeightOfGT {

    static int HeightGT(Node node) {

        int ht = -1;

        for (Node ch : node.Children) {

            ht = Math.max(ht, HeightGT(ch));
        }

        ht += 1;

        return ht;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, -1, 7, -1, 4, -1, -1, 6, 8, 11, -1, 12, -1, -1, 9, 10, -1, -1, -1, -1 };

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

        System.out.println(HeightGT(root));

    }
}