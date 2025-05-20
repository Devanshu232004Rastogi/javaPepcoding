import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//  class Node{

//     int data ;
//     ArrayList<Node> Children = new ArrayList<>();

// }

public class LevelOrderTraversal {
    static void LvlT(Node node){
Queue<Node> q = new ArrayDeque<>();


q.offer(node);
System.out.println("");
while(q.size()>0){
    node = q.remove();
    System.out.print(node.data +  " ");

    for(Node ch : node.Children){
        q.add(ch);

    }

}
System.out.print(" !");

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

        LvlT(root);
    }
}
