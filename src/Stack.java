import java.util.*;

public class Stack implements StackOperations{
    private final List<String> list = new ArrayList<String>();

    @Override
    public List<String> get() {
        return list;
    }

    @Override
    public Optional<String> pop() {
        if (this.list.isEmpty()){
            System.out.println("The stock is empty!");
            return Optional.empty();
        }
        String value = this.list.get(this.list.size() - 1);

        this.list.remove(this.list.size()-1);

        return Optional.of(value);
    }

    public void push(final String item){
        list.add(item);
    }
}
