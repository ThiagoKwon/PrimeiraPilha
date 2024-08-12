package pilha;

public interface Stack<T> {
	public void push(T data);

	public T pop();

	public void clear();

	public boolean isFull();

	public boolean isEmpty();
}
