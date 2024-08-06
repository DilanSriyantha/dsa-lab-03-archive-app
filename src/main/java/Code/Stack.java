package Code;

public class Stack {
    int maxSize;
    Book[] stackArray;
    int top;
    
    public Stack(int maxSize){
        this.maxSize = maxSize;
        stackArray = new Book[maxSize];
        top = -1;
    }
    
    public void push(Book b) throws ArrayIndexOutOfBoundsException {
        if(top == (maxSize - 1))
            throw new ArrayIndexOutOfBoundsException("Stack is full.");
        
        stackArray[++top] = b;
    }
    
    public Book pop() throws ArrayIndexOutOfBoundsException {
        if(top < 0)
            throw new ArrayIndexOutOfBoundsException("Stack is empty.");
        
        return stackArray[top--];
    }
    
    public Book peek() throws ArrayIndexOutOfBoundsException {
        if(top < 0)
            throw new ArrayIndexOutOfBoundsException("Stack is empty.");
        
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return top < 0;
    }
    
    public boolean isFull() {
        return (top == (maxSize - 1));
    }
    
    public int getMaxSize() {
        return maxSize;
    }
    
    public int getTop() {
        return top;
    }
    
    public Book getBook(int idx){
        if(idx == maxSize) return null;
        
        return stackArray[idx];
    }
}
