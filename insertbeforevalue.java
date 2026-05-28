class node{
    int data;
    node next;
    node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class insertbeforevalue{
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
    public static node insertllbefore(node head,int el,int k){
     if(head==null){
        return null;
     
     }
     if(head.data==k){
        return new node(el);
     }
     node temp=head;
     while(temp.next!=null){
        if(temp.next.data==k){
            node newnode=new node(el);
            newnode.next=temp.next;
            temp.next=newnode;
            break;
        }
        temp=temp.next;
        }
    return head;
    }


        
      
       
    
    public static void main(String []args){
        int []arr={1,2,3,4,5};
        node head=array2ll(arr);
        head=insertllbefore(head, 89, 4);
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        
    }
} 
   


        
      
       
    
