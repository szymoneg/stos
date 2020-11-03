public class Main {

    public static void main(String[] args) {
	    Stack stack = new Stack();

	    stack.push("Szymon");
        stack.push("Andrzej");
        stack.push("Janusz");

        System.out.println(stack.get());

        System.out.println(stack.pop());

        System.out.println(stack.get());
    }
}
