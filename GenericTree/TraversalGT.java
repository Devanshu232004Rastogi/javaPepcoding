import java.util.Stack;

//  class Node{

//     int data ;
//     ArrayList<Node> Children = new ArrayList<>();

// }

public class TraversalGT {

    static void TrGt(Node node) {
System.out.println("Node Pre " + node.data);

for(Node c : node.Children){
    System.out.println("Edge Pre " +node.data+"--"+ c.data );
    TrGt(c);
    System.out.println("Edge Post " +node.data+"--"+ c.data );
    
}

System.out.println("Node Post " + node.data);
        
    }

    static int SizeCalc(Node node) {
        int cnt = 0;
        for (Node c : node.Children) {
            cnt += SizeCalc(c);
        }

        cnt += 1;

        return cnt;
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 3, 5, -1, 7, -1, 4, -1, -1, 6, 8, 11, -1, 12, -1, -1, 9, 10, -1, -1, -1, -1 };
        int[] arr = { 10 , 20 , -1 , 30 , 50 ,-1 ,60,-1,-1,40,-1,-1 };

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

        TrGt(root);
    }
}
