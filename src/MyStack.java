public class MyStack {
    private int[] arr;
    private int size;
    private  int index=0;

    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }

    public void push(int element){
        if (isFull()){
            System.out.println("full");
        } else {
            arr[index] = element;
            index++;
        }
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Empty");
        } else {
            return arr[--index];
        }
    }

    public int size(){
        return index;
    }

    public boolean isEmpty(){
        boolean conclude = false;
        if (size==0){
            conclude = true;
        }
        return conclude;
    }

    public boolean isFull(){
        boolean conclude = false;
        if (index == size){
            conclude = true;
        }
        return conclude;
    }
}
