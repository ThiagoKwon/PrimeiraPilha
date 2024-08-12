package pilha;

public class StaticStack<T> implements Stack<T> {

	private int top = 0;
	private T[] data;
	private int size;

	@SuppressWarnings("unchecked")
	public StaticStack(int size) {
		this.data = (T[]) new Long[size];
		this.size = size;
	}

	@Override
	public void push(T data) {
		if (isFull()) {
			throw new IllegalAccessError("Pilha cheia!");
		}
		this.data[this.top] = data;
		this.top++;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			throw new IllegalAccessError("Pilhha já está vazia!");
		}
		T retorno = this.data[this.top - 1];
		this.data[this.top - 1] = null;
		this.top--;
		return retorno;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.data.length; i++) {
			this.data[i] = null;
		}
		this.top = 0;
	}

	@Override
	public boolean isFull() {
		return this.top == this.size;
	}

	@Override
	public boolean isEmpty() {
		if (this.top == 0) {
			return true;
		}
		return false;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
