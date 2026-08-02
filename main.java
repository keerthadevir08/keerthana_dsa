
public class main {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.top();

        s.pop();

        s.top();

        System.out.println("Size = " + s.size());

        System.out.println("Is Empty = " + s.isEmpty());

        System.out.println("Is Full = " + s.isFull());
    }
}
