class node{
    int data;
    node next;
    node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class arrtolinkedlist{
    public static node array2ll(int[]arr){
        node head =new node(arr[0]);
        node mover=head;
        for(int i=1;i<arr.length;i++){
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;
    }
    public static void main(String []args){
        int []arr={1,2,3,4,5};
        node head=array2ll(arr);
        System.out.println(head.data);
    }
}

