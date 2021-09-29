package LAB3;

public class S_Stack {
    int stack[]=new int[5]; //array implimentation
    int top = 0;

    public void push(int data)
    {
        stack[top] = data;
        top++;
    }

    public int pop()
    {
        int data;
        top--;
        data =stack[top];
        stack[top]=0;

        return data;
    }

    public  void show()
    {
        for(int n : stack)
        {
            System.out.print(n+" ");
        }
    }

    public void peak(){
        System.out.println(stack[top-1]);
    }
}
